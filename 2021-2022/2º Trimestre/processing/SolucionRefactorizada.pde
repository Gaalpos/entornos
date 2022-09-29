class Estrella {
  PVector pos= new PVector(width/2, height/2);
  float radio=10;
  float masa=9E12;
  void paint() {
    fill(0, 255, 255);
    circle(pos.x, pos.y, radio*2);
  }
  void atraer(Planeta p) {
    PVector vector = PVector.sub(pos, p.pos);
    float distancia = vector.mag();
    if (distancia>50) distancia = 50;
    final float G = 6.67E-11;
    float valorFuerzaAtraccion = G * (masa * p.masa)/(distancia*distancia);
    vector.setMag(valorFuerzaAtraccion);
    p.applyForce(vector);
  }
}

class Planeta {
  PVector pos= new PVector(0, 0);
  PVector vel= new PVector(6, 0);
  PVector ace= new PVector(0.2, 0);
  float masa=9E13;
  //TODO: usar el nombre del color en lugar de RGB
  //String elColor = "red";
  float radio = 5;
  public Planeta(float posX, float posY) {
    this.pos.x=posX;
    this.pos.y=posY;
  }
  void paint() {
    fill(255, 0, 0); //Rojo
    circle(pos.x, pos.y, radio*2);
  }
  void update() {
    vel.add(ace);
    pos.add(vel);

    ace.set(0, 0);
  }
  void applyForce(PVector fuerza) {
    PVector tempAce= PVector.div(fuerza, masa);
    ace.add(tempAce);
  }
}

Estrella e;
ArrayList <Planeta> planetas= new ArrayList<Planeta>();

void setup() {//Se ejecuta una vez
  size(640, 480);
  for (int i=0; i<10; i++) {
    Planeta nuevoPlaneta = new Planeta (random(width), random(height));
    nuevoPlaneta.vel.x=random(3);
    nuevoPlaneta.vel.y=random(3);
    planetas.add(nuevoPlaneta);
  }
  e=new Estrella();
}

void draw() {//Se ejecuta por cada fotograma FPS
  background (0);
  for (Planeta p : planetas) {
    p.paint();
    p.update();
    e.atraer(p);
  }
  e.paint();
  
}

void mouseClicked() {
  /*PVector forceTemp = new PVector(mouseX-p.pos.x, mouseY-p.pos.y);
   if (forceTemp.mag() > 20) forceTemp.setMag(20);
   p.applyForce(forceTemp);*/
  e.pos.x=mouseX;
  e.pos.y=mouseY;
}

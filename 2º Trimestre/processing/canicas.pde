import java.util.Random;
Random rand = new Random();
class Pelota {
  int x;
  int y;
  int radio = 20;
  int inc = 7;
  int velX = 4;
  int velY = 3;
  Pelota(int x, int y, int radio) {
    this.x=x;
    this.y=y;
    this.radio=radio;
  }
  void calculaColision() {
    if (x>=width-radio) velX=-inc;
    if (x<=0+radio) velX=+inc;
    if (y>=height-radio) velY=-inc;
    if (y<=0+radio) velY=+inc;
  }
  void dibujar() {
    circle(x, y, radio*2);
    fill(66, 245, 170);
 
  }
  void actualizar() {
    x=x+velX;
    y=y+velY;
  }
}

/*
Pelota canica = new Pelota(100, 30, 20);
 Pelota [] canicas = {
 new Pelota (80, 60, 30),
 new Pelota (180, 60, 10),
 new Pelota (60, 30, 60),
 };
 */

ArrayList<Pelota> canicas = new ArrayList();

void setup() {
  size(720, 540);
  for (int i=0; i<100; i++) {
    Pelota nuevaCanicaRandom = new Pelota (
      (int)(Math.random()*width),
      (int) (Math.random()*height),
      (int)(Math.random()*30));


    canicas.add(nuevaCanicaRandom);
  }
}
void draw() {
  background(53, 146, 222);
  for (Pelota canica : canicas) {
    canica.actualizar();
    canica.calculaColision();
    canica.dibujar();
  }
}

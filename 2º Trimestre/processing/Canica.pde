class Pelota{
  int x;
  int y;
  int radio = 20;
  int inc = 7;
  int velX = 4;
  int velY = 3;
  Pelota(int x, int y, int radio){ 
    this.x=x;
    this.y=y;
    this.radio=radio;
  }
  void calculaColision(){
    if(x>=width-radio) velX=-inc;
    if(x<=0+radio) velX=+inc;
    if(y>=height-radio) velY=-inc;
    if(y<=0+radio) velY=+inc;
  }
  void dibujar(){
    circle(x,y, radio*2);
  }
  void actualizar(){
    x=x+velX;
    y=y+velY;
  }
}


Pelota canica = new Pelota(100,30,20);

void setup() {
  size(200, 300);
}
void draw() {
  background(0);
  canica.actualizar();
  canica.calculaColision();
  canica.dibujar();
}

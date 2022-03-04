class Vector2D {
  double x;
  double y;

  Vector2D(double x, double y) {
    this.x = x;
    this.y = y;
  }
}

public double angle=0;
double len=100;
final double gravity = 5;
Vector2D origin=new Vector2D(200, 100);
double angleVelocidad = 0.1;
double angleAceleracion = 0;
Vector2D bob = new Vector2D(0,0);
  
void setup() {
  size(400,400);
  stroke(255);
}

void draw() {
  background(0);
  
  double sin = Math.sin(angle);

  double force = gravity * sin;
  angleAceleracion = (-1 * force) / len;
  angleVelocidad += angleAceleracion;
  angle += angleVelocidad;
  bob.x = len * sin + origin.x;
  bob.y = len * Math.cos(angle) + origin.y;
  line((float)origin.x, (float)origin.y, (float)bob.x, (float)bob.y);
  circle((float)bob.x, (float)bob.y, 30);
}

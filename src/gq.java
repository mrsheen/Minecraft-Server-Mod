import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class gq
{
  public dv a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i = 0;
  private double l;
  private double m;
  private double n;
  private boolean o = false;

  public boolean j = false;

  public Set<eo> k = new HashSet();
  public static HashSet<String> invizPlayers;

  public gq(dv paramdv, int paramInt1, int paramInt2)
  {
    this.a = paramdv;
    this.b = paramInt1;
    this.c = paramInt2;

    this.d = hb.b(paramdv.p * 32.0D);
    this.e = hb.b(paramdv.q * 32.0D);
    this.f = hb.b(paramdv.r * 32.0D);
    this.g = hb.d(paramdv.v * 256.0F / 360.0F);
    this.h = hb.d(paramdv.w * 256.0F / 360.0F);
  }

  public boolean equals(Object paramObject) {
    if ((paramObject instanceof gq)) {
      return ((gq)paramObject).a.g == this.a.g;
    }

    return false;
  }

  public int hashCode() {
    return this.a.g;
  }

  public void a(List paramList) {
    this.j = false;
    if ((!this.o) || (this.a.d(this.l, this.m, this.n) > 16.0D)) {
      b(paramList);
      this.l = this.a.p;
      this.m = this.a.q;
      this.n = this.a.r;
      this.o = true;
      this.j = true;
    }

    if (this.i++ % this.c == 0) {
      int i1 = hb.b(this.a.p * 32.0D);
      int i2 = hb.b(this.a.q * 32.0D);
      int i3 = hb.b(this.a.r * 32.0D);
      int i4 = hb.d(this.a.v * 256.0F / 360.0F);
      int i5 = hb.d(this.a.w * 256.0F / 360.0F);

      int i6 = (i1 != this.d) || (i2 != this.e) || (i3 != this.f) ? 1 : 0;
      int i7 = (i4 != this.g) || (i5 != this.h) ? 1 : 0;

      int i8 = i1 - this.d;
      int i9 = i2 - this.e;
      int i10 = i3 - this.f;
      Object localObject = null;

      if ((i8 < -128) || (i8 >= 128) || (i9 < -128) || (i9 >= 128) || (i10 < -128) || (i10 >= 128)) {
        localObject = new cq(this.a.g, i1, i2, i3, (byte)i4, (byte)i5);
      }
      else if ((i6 != 0) && (i7 != 0))
        localObject = new bn(this.a.g, (byte)i8, (byte)i9, (byte)i10, (byte)i4, (byte)i5);
      else if (i6 != 0)
        localObject = new ee(this.a.g, (byte)i8, (byte)i9, (byte)i10);
      else if (i7 != 0)
        localObject = new di(this.a.g, (byte)i4, (byte)i5);
      else {
        localObject = new fo(this.a.g);
      }

      if (localObject != null) {
        a((im)localObject);
      }

      this.d = i1;
      this.e = i2;
      this.f = i3;
      this.g = i4;
      this.h = i5;
    }
  }

  public void a(im paramim) {
    for (eo localeo : this.k)
      localeo.a.b(paramim);
  }

  public void a()
  {
    a(new de(this.a.g));
  }

  public void a(eo parameo)
  {
    if (parameo == this.a) return;

    if (((this.a instanceof eo)) && (invizPlayers != null) && (invizPlayers.contains(((eo)this.a).ar.toLowerCase()))) return;

    double d1 = parameo.p - this.d / 32;
    double d2 = parameo.r - this.f / 32;
    if ((d1 >= -this.b) && (d1 <= this.b) && (d2 >= -this.b) && (d2 <= this.b)) {
      if (!this.k.contains(parameo)) {
        this.k.add(parameo);
        parameo.a.b(b());
      }
    }
    else if (this.k.contains(parameo)) {
      this.k.remove(parameo);
      parameo.a.b(new de(this.a.g));
    }
  }

  public void b(List paramList)
  {
    for (int i1 = 0; i1 < paramList.size(); i1++)
      a((eo)paramList.get(i1));
  }

  private im b()
  {
    Object localObject;
    if ((this.a instanceof gf)) {
      localObject = (gf)this.a;
      k localk = new k((gf)localObject);
      ((gf)localObject).p = (localk.b / 32.0D);
      ((gf)localObject).q = (localk.c / 32.0D);
      ((gf)localObject).r = (localk.d / 32.0D);
      ((gf)localObject).s = (localk.e / 128.0D);
      ((gf)localObject).t = (localk.f / 128.0D);
      ((gf)localObject).u = (localk.g / 128.0D);
      return localk;
    }
    if ((this.a instanceof eo)) {
      return new c((ft)this.a);
    }
    if ((this.a instanceof jh)) {
      localObject = (jh)this.a;
      if (((jh)localObject).d == 0) return new dx(this.a, 10);
      if (((jh)localObject).d == 1) return new dx(this.a, 11);
      if (((jh)localObject).d == 2) return new dx(this.a, 12);
    }
    if ((this.a instanceof fh)) {
      return new dx(this.a, 1);
    }
    if ((this.a instanceof ad)) {
      return new ho((jt)this.a);
    }
    if ((this.a instanceof jz)) {
      return new cb(this.a, 1);
    }
    throw new IllegalArgumentException("Don't know how to add " + this.a.getClass() + "!");
  }
}
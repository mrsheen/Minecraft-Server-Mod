import java.util.Random;

public class iy
  implements br
{
  private Random j;
  private fm k;
  private fm l;
  private fm m;
  private fm n;
  private fm o;
  public fm a;
  public fm b;
  public fm c;
  private el p;
  private double[] q;
  private double[] r = new double[256];
  private double[] s = new double[256];
  private double[] t = new double[256];

  private fb u = new dz();
  private ih[] v;
  double[] d;
  double[] e;
  double[] f;
  double[] g;
  double[] h;
  int[][] i = new int[32][32];
  private double[] w;

  public iy(el paramel, long paramLong)
  {
    this.p = paramel;

    this.j = new Random(paramLong);
    this.k = new fm(this.j, 16);
    this.l = new fm(this.j, 16);
    this.m = new fm(this.j, 8);
    this.n = new fm(this.j, 4);
    this.o = new fm(this.j, 4);

    this.a = new fm(this.j, 10);
    this.b = new fm(this.j, 16);

    this.c = new fm(this.j, 8);
  }

  public void a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, ih[] paramArrayOfih, double[] paramArrayOfDouble)
  {
    int i1 = 4;
    int i2 = 64;

    int i3 = i1 + 1;
    int i4 = 17;
    int i5 = i1 + 1;
    this.q = a(this.q, paramInt1 * i1, 0, paramInt2 * i1, i3, i4, i5);

    for (int i6 = 0; i6 < i1; i6++)
      for (int i7 = 0; i7 < i1; i7++)
        for (int i8 = 0; i8 < 16; i8++) {
          double d1 = 0.125D;
          double d2 = this.q[(((i6 + 0) * i5 + (i7 + 0)) * i4 + (i8 + 0))];
          double d3 = this.q[(((i6 + 0) * i5 + (i7 + 1)) * i4 + (i8 + 0))];
          double d4 = this.q[(((i6 + 1) * i5 + (i7 + 0)) * i4 + (i8 + 0))];
          double d5 = this.q[(((i6 + 1) * i5 + (i7 + 1)) * i4 + (i8 + 0))];

          double d6 = (this.q[(((i6 + 0) * i5 + (i7 + 0)) * i4 + (i8 + 1))] - d2) * d1;
          double d7 = (this.q[(((i6 + 0) * i5 + (i7 + 1)) * i4 + (i8 + 1))] - d3) * d1;
          double d8 = (this.q[(((i6 + 1) * i5 + (i7 + 0)) * i4 + (i8 + 1))] - d4) * d1;
          double d9 = (this.q[(((i6 + 1) * i5 + (i7 + 1)) * i4 + (i8 + 1))] - d5) * d1;

          for (int i9 = 0; i9 < 8; i9++) {
            double d10 = 0.25D;

            double d11 = d2;
            double d12 = d3;
            double d13 = (d4 - d2) * d10;
            double d14 = (d5 - d3) * d10;

            for (int i10 = 0; i10 < 4; i10++) {
              int i11 = i10 + i6 * 4 << 11 | 0 + i7 * 4 << 7 | i8 * 8 + i9;
              int i12 = 128;
              double d15 = 0.25D;

              double d16 = d11;
              double d17 = (d12 - d11) * d15;
              for (int i13 = 0; i13 < 4; i13++)
              {
                double d18 = paramArrayOfDouble[((i6 * 4 + i10) * 16 + (i7 * 4 + i13))];
                int i14 = 0;
                if (i8 * 8 + i9 < i2) {
                  if ((d18 < 0.5D) && (i8 * 8 + i9 >= i2 - 1))
                    i14 = fw.aU.bi;
                  else {
                    i14 = fw.C.bi;
                  }
                }
                if (d16 > 0.0D) {
                  i14 = fw.u.bi;
                }

                paramArrayOfByte[i11] = (byte)i14;
                i11 += i12;
                d16 += d17;
              }
              d11 += d13;
              d12 += d14;
            }

            d2 += d6;
            d3 += d7;
            d4 += d8;
            d5 += d9;
          }
        }
  }

  public void a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, ih[] paramArrayOfih)
  {
    int i1 = 64;

    double d1 = 0.03125D;
    this.r = this.n.a(this.r, paramInt1 * 16, paramInt2 * 16, 0.0D, 16, 16, 1, d1, d1, 1.0D);
    this.s = this.n.a(this.s, paramInt2 * 16, 109.0134D, paramInt1 * 16, 16, 1, 16, d1, 1.0D, d1);
    this.t = this.o.a(this.t, paramInt1 * 16, paramInt2 * 16, 0.0D, 16, 16, 1, d1 * 2.0D, d1 * 2.0D, d1 * 2.0D);

    for (int i2 = 0; i2 < 16; i2++)
      for (int i3 = 0; i3 < 16; i3++) {
        ih localih = paramArrayOfih[(i2 * 16 + i3)];
        int i4 = this.r[(i2 + i3 * 16)] + this.j.nextDouble() * 0.2D > 0.0D ? 1 : 0;
        int i5 = this.s[(i2 + i3 * 16)] + this.j.nextDouble() * 0.2D > 3.0D ? 1 : 0;
        int i6 = (int)(this.t[(i2 + i3 * 16)] / 3.0D + 3.0D + this.j.nextDouble() * 0.25D);

        int i7 = -1;

        int i8 = localih.o;
        int i9 = localih.p;

        for (int i10 = 127; i10 >= 0; i10--) {
          int i11 = (i2 * 16 + i3) * 128 + i10;

          if (i10 <= 0 + this.j.nextInt(5)) {
            paramArrayOfByte[i11] = (byte)fw.A.bi;
          } else {
            int i12 = paramArrayOfByte[i11];

            if (i12 == 0)
              i7 = -1;
            else if (i12 == fw.u.bi)
              if (i7 == -1) {
                if (i6 <= 0) {
                  i8 = 0;
                  i9 = (byte)fw.u.bi;
                } else if ((i10 >= i1 - 4) && (i10 <= i1 + 1)) {
                  i8 = localih.o;
                  i9 = localih.p;
                  if (i5 != 0) i8 = 0;
                  if (i5 != 0) i9 = (byte)fw.G.bi;
                  if (i4 != 0) i8 = (byte)fw.F.bi;
                  if (i4 != 0) i9 = (byte)fw.F.bi;
                }

                if ((i10 < i1) && (i8 == 0)) i8 = (byte)fw.C.bi;

                i7 = i6;
                if (i10 >= i1 - 1) paramArrayOfByte[i11] = (byte)i8; else
                  paramArrayOfByte[i11] = (byte)i9;
              } else if (i7 > 0) {
                i7--;
                paramArrayOfByte[i11] = (byte)i9;
              }
          }
        }
      }
  }

  public jn b(int paramInt1, int paramInt2)
  {
    this.j.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);

    byte[] arrayOfByte = new byte[32768];
    jn localjn = new jn(this.p, arrayOfByte, paramInt1, paramInt2);
    
    int big1 = paramInt1 * 16;
	int big2 = paramInt2 * 16;

	int[] mapLimits = new int[] {0,0,0};
	mapLimits = etc.getInstance().getLimits();

	int distance = Math.max(Math.abs(big1 - mapLimits[0]), Math.abs(big2 - mapLimits[1]));

	int mapLimit = mapLimits[2];

	int shift1 = big1 >> 4;
	int shift2 = big2 >> 4;
	int mask1 = big1 & 0xF;
	int mask2 = big2 & 0xF;

	//System.out.println("Generating chunk (" + Integer.toString(big1) + ","+ Integer.toString(big2)+") - "+Integer.toString(shift1)+","+Integer.toString(shift2)+" " +Integer.toString(mask1)+","+Integer.toString(mask2) + " : " + Integer.toString(distance));

    if (distance >= (mapLimit+1)) // hard limit
	{
		//System.out.println("Generating void chunk (" + Integer.toString(big1) + ","+ Integer.toString(big2)+") - "+Integer.toString(distance));
		arrayOfByte = new byte[32768];
	}
	else if (distance >= (mapLimit-15) && distance <= (mapLimit)) // soft limit
	{
		//System.out.println("Generating border chunk (" + Integer.toString(big1) + ","+ Integer.toString(big2)+") - "+Integer.toString(distance));
		for(int k1 = 0; k1 < 32768; k1++) {
			arrayOfByte[k1] = 48; // Lots of moss.
		}
	}
	else
	{
		this.v = this.p.a().a(this.v, paramInt1 * 16, paramInt2 * 16, 16, 16);
        double[] arrayOfDouble = this.p.a().a;

        a(paramInt1, paramInt2, arrayOfByte, this.v, arrayOfDouble);
        a(paramInt1, paramInt2, arrayOfByte, this.v);

		this.u.a(this, this.p, paramInt1, paramInt2, arrayOfByte);	
	}
    

    localjn.b();

    return localjn;
  }
 

  private double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (paramArrayOfDouble == null) {
      paramArrayOfDouble = new double[paramInt4 * paramInt5 * paramInt6];
    }

    double d1 = 684.41200000000003D;
    double d2 = 684.41200000000003D;

    double[] arrayOfDouble1 = this.p.a().a;
    double[] arrayOfDouble2 = this.p.a().b;
    this.g = this.a.a(this.g, paramInt1, paramInt3, paramInt4, paramInt6, 1.121D, 1.121D, 0.5D);
    this.h = this.b.a(this.h, paramInt1, paramInt3, paramInt4, paramInt6, 200.0D, 200.0D, 0.5D);

    this.d = this.m.a(this.d, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 160.0D, d1 / 80.0D);
    this.e = this.k.a(this.e, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
    this.f = this.l.a(this.f, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);

    int i1 = 0;
    int i2 = 0;

    int i3 = 16 / paramInt4;
    for (int i4 = 0; i4 < paramInt4; i4++) {
      int i5 = i4 * i3 + i3 / 2;

      for (int i6 = 0; i6 < paramInt6; i6++) {
        int i7 = i6 * i3 + i3 / 2;
        double d3 = arrayOfDouble1[(i5 * 16 + i7)];
        double d4 = arrayOfDouble2[(i5 * 16 + i7)] * d3;
        double d5 = 1.0D - d4;
        d5 *= d5;
        d5 *= d5;
        d5 = 1.0D - d5;

        double d6 = (this.g[i2] + 256.0D) / 512.0D;
        d6 *= d5;
        if (d6 > 1.0D) d6 = 1.0D;

        double d7 = this.h[i2] / 8000.0D;
        if (d7 < 0.0D) d7 = -d7 * 0.3D;
        d7 = d7 * 3.0D - 2.0D;

        if (d7 < 0.0D) {
          d7 /= 2.0D;
          if (d7 < -1.0D) d7 = -1.0D;
          d7 /= 1.4D;
          d7 /= 2.0D;
          d6 = 0.0D;
        } else {
          if (d7 > 1.0D) d7 = 1.0D;
          d7 /= 8.0D;
        }

        if (d6 < 0.0D) d6 = 0.0D;
        d6 += 0.5D;
        d7 = d7 * paramInt5 / 16.0D;

        double d8 = paramInt5 / 2.0D + d7 * 4.0D;

        i2++;

        for (int i8 = 0; i8 < paramInt5; i8++) {
          double d9 = 0.0D;

          double d10 = (i8 - d8) * 12.0D / d6;
          if (d10 < 0.0D) d10 *= 4.0D;

          double d11 = this.e[i1] / 512.0D;
          double d12 = this.f[i1] / 512.0D;

          double d13 = (this.d[i1] / 10.0D + 1.0D) / 2.0D;
          if (d13 < 0.0D) d9 = d11;
          else if (d13 > 1.0D) d9 = d12; else
            d9 = d11 + (d12 - d11) * d13;
          d9 -= d10;

          if (i8 > paramInt5 - 4) {
            double d14 = (i8 - (paramInt5 - 4)) / 3.0F;
            d9 = d9 * (1.0D - d14) + -10.0D * d14;
          }

          paramArrayOfDouble[i1] = d9;
          i1++;
        }
      }
    }
    return paramArrayOfDouble;
  }

  public boolean a(int paramInt1, int paramInt2) {
    return true;
  }

  public void a(br parambr, int paramInt1, int paramInt2)
  {
    fp.a = true;
    int i1 = paramInt1 * 16;
    int i2 = paramInt2 * 16;
    
    

    ih localih = this.p.a().a(i1 + 16, i2 + 16);

    this.j.setSeed(this.p.u);
    long l1 = this.j.nextLong() / 2L * 2L + 1L;
    long l2 = this.j.nextLong() / 2L * 2L + 1L;
    this.j.setSeed(paramInt1 * l1 + paramInt2 * l2 ^ this.p.u);
    double d1 = 0.25D;
    int i5;
    int i3;
    int i4;
    int i6;
    for (i3 = 0; i3 < 8; i3++) {
      i4 = i1 + this.j.nextInt(16) + 8;
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16) + 8;
      new dw().a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 10; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16);
      new f(32).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 20; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16);
      new eu(fw.w.bi, 32).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 10; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16);
      new eu(fw.G.bi, 32).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 20; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16);
      new eu(fw.J.bi, 16).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 20; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(64);
      i6 = i2 + this.j.nextInt(16);
      new eu(fw.I.bi, 8).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 2; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(32);
      i6 = i2 + this.j.nextInt(16);
      new eu(fw.H.bi, 8).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 8; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(16);
      i6 = i2 + this.j.nextInt(16);
      new eu(fw.aO.bi, 7).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 1; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(16);
      i6 = i2 + this.j.nextInt(16);
      new eu(fw.ax.bi, 7).a(this.p, this.j, i4, i5, i6);
    }

    d1 = 0.5D;
    i3 = (int)((this.c.a(i1 * d1, i2 * d1) / 8.0D + this.j.nextDouble() * 4.0D + 4.0D) / 3.0D);

    i4 = 0;
    if (this.j.nextInt(10) == 0) i4++;

    if (localih == ih.d) i4 += i3 + 5;
    if (localih == ih.a) i4 += i3 + 5;
    if (localih == ih.c) i4 += i3 + 2;
    if (localih == ih.g) i4 += i3 + 5;

    if (localih == ih.h) i4 -= 20;
    if (localih == ih.k) i4 -= 20;
    if (localih == ih.i) i4 -= 20;

    Object localObject = new jb();
    if (this.j.nextInt(10) == 0) {
      localObject = new gy();
    }
    if ((localih == ih.a) && (this.j.nextInt(3) == 0))
      localObject = new gy();
    int i8;
    int i7;
    for (i6 = 0; i6 < i4; i6++) {
      i7 = i1 + this.j.nextInt(16) + 8;
      i8 = i2 + this.j.nextInt(16) + 8;
      ((bg)localObject).a(1.0D, 1.0D, 1.0D);
      ((bg)localObject).a(this.p, this.j, i7, this.p.d(i7, i8), i8);
    }
    int i9;
    for (i6 = 0; i6 < 2; i6++) {
      i7 = i1 + this.j.nextInt(16) + 8;
      i8 = this.j.nextInt(128);
      i9 = i2 + this.j.nextInt(16) + 8;
      new au(fw.ae.bi).a(this.p, this.j, i7, i8, i9);
    }

    if (this.j.nextInt(2) == 0) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = this.j.nextInt(128);
      i8 = i2 + this.j.nextInt(16) + 8;
      new au(fw.af.bi).a(this.p, this.j, i6, i7, i8);
    }

    if (this.j.nextInt(4) == 0) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = this.j.nextInt(128);
      i8 = i2 + this.j.nextInt(16) + 8;
      new au(fw.ag.bi).a(this.p, this.j, i6, i7, i8);
    }

    if (this.j.nextInt(8) == 0) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = this.j.nextInt(128);
      i8 = i2 + this.j.nextInt(16) + 8;
      new au(fw.ah.bi).a(this.p, this.j, i6, i7, i8);
    }

    for (i6 = 0; i6 < 10; i6++) {
      i7 = i1 + this.j.nextInt(16) + 8;
      i8 = this.j.nextInt(128);
      i9 = i2 + this.j.nextInt(16) + 8;
      new hd().a(this.p, this.j, i7, i8, i9);
    }

    if (this.j.nextInt(32) == 0) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = this.j.nextInt(128);
      i8 = i2 + this.j.nextInt(16) + 8;
      new ib().a(this.p, this.j, i6, i7, i8);
    }

    i6 = 0;
    if (localih == ih.h) i6 += 10;
    int i10;
    for (i7 = 0; i7 < i6; i7++) {
      i8 = i1 + this.j.nextInt(16) + 8;
      i9 = this.j.nextInt(128);
      i10 = i2 + this.j.nextInt(16) + 8;
      new ff().a(this.p, this.j, i8, i9, i10);
    }

    for (i7 = 0; i7 < 50; i7++) {
      i8 = i1 + this.j.nextInt(16) + 8;
      i9 = this.j.nextInt(this.j.nextInt(120) + 8);
      i10 = i2 + this.j.nextInt(16) + 8;
      new in(fw.B.bi).a(this.p, this.j, i8, i9, i10);
    }

    for (i7 = 0; i7 < 20; i7++) {
      i8 = i1 + this.j.nextInt(16) + 8;
      i9 = this.j.nextInt(this.j.nextInt(this.j.nextInt(112) + 8) + 8);
      i10 = i2 + this.j.nextInt(16) + 8;
      new in(fw.D.bi).a(this.p, this.j, i8, i9, i10);
    }

    this.w = this.p.a().a(this.w, i1 + 8, i2 + 8, 16, 16);
    for (i7 = i1 + 8; i7 < i1 + 8 + 16; i7++) {
      for (i8 = i2 + 8; i8 < i2 + 8 + 16; i8++) {
        i9 = i7 - (i1 + 8);
        i10 = i8 - (i2 + 8);
        int i11 = this.p.e(i7, i8);
        double d2 = this.w[(i9 * 16 + i10)] - (i11 - 64) / 64.0D * 0.3D;

        if ((d2 >= 0.5D) || 
          (i11 <= 0) || (i11 >= 128) || (this.p.a(i7, i11, i8) != 0) || (!this.p.c(i7, i11 - 1, i8).c()) || 
          (this.p.c(i7, i11 - 1, i8) == jr.r)) continue; this.p.d(i7, i11, i8, fw.aT.bi);
      }

    }

    fp.a = false;
  }

  public boolean a(boolean paramBoolean, iv paramiv) {
    return true;
  }

  public boolean a() {
    return false;
  }

  public boolean b() {
    return true;
  }
}
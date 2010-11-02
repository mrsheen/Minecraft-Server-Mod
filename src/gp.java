import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class gp
{
  private Set<gq> a = new HashSet();
  public hz b = new hz();
  private MinecraftServer c;
  private int d;

  public gp(MinecraftServer paramMinecraftServer)
  {
    this.c = paramMinecraftServer;
    this.d = paramMinecraftServer.f.a();
  }

  public void a(dv paramdv)
  {
    eo localeo;
    if ((paramdv instanceof eo)) {
      a(paramdv, 512, 2);
      localeo = (eo)paramdv;
      for (gq localgq : this.a) {
        if (localgq.a != localeo) {
          localgq.a(localeo);
        }
      }
    }
    else if ((paramdv instanceof jz)) { a(paramdv, 64, 20);
    } else if ((paramdv instanceof gf)) { a(paramdv, 64, 20);
    } else if ((paramdv instanceof jh)) { a(paramdv, 160, 4);
    } else if ((paramdv instanceof fh)) { a(paramdv, 160, 4);
    } else if ((paramdv instanceof ad)) { a(paramdv, 160, 2); }
  }

  public void a(dv paramdv, int paramInt1, int paramInt2) {
    if (paramInt1 > this.d) paramInt1 = this.d;
    if (this.b.b(paramdv.g)) throw new IllegalStateException("Entity is already tracked!");
    gq localgq = new gq(paramdv, paramInt1, paramInt2);
    this.a.add(localgq);
    this.b.a(paramdv.g, localgq);
    localgq.b(this.c.e.d);
  }

  public void b(dv paramdv) {
    gq localgq = (gq)this.b.d(paramdv.g);
    if (localgq != null) {
      this.a.remove(localgq);
      localgq.a();
    }
  }

  public void a()
  {
    ArrayList localArrayList = new ArrayList();
	Object localObject;
    for (Iterator localIterator1 = this.a.iterator(); localIterator1.hasNext(); ) { localObject = (gq)localIterator1.next();
      ((gq)localObject).a(this.c.e.d);
      if ((((gq)localObject).j) && ((((gq)localObject).a instanceof eo)))
        localArrayList.add((eo)((gq)localObject).a);
    }
    //Object localObject;
    for (int i = 0; i < localArrayList.size(); i++) {
      localObject = (eo)localArrayList.get(i);
      for (gq localgq : this.a)
        if (localgq.a != localObject)
          localgq.a((eo)localObject);
    }
  }

  public void a(dv paramdv, im paramim)
  {
    gq localgq = (gq)this.b.a(paramdv.g);
    if (localgq != null)
      localgq.a(paramim);
  }
}
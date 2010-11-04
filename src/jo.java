/*     */ public class jo
/*     */ {
/*     */   private el b;
/*     */   public ft a;
/*     */   private float c;
/*  12 */   private float d = 0.0F;
/*  13 */   private int e = 0;
/*  14 */   private float f = 0.0F;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */ 
/*     */   public jo(el paramel)
/*     */   {
/*  18 */     this.b = paramel;
/*     */   }
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/*  22 */     int j = this.b.a(paramInt1, paramInt2, paramInt3);
/*  23 */     if ((j > 0) && (this.d == 0.0F)) fw.n[j].b(this.b, paramInt1, paramInt2, paramInt3, this.a);
/*  24 */     if ((j > 0) && (fw.n[j].a(this.a) >= 1.0F))
/*  25 */       c(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ 
/*     */   public void a()
/*     */   {
/*  30 */     this.d = 0.0F;
/*  31 */     this.e = 0;
/*     */   }
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  35 */     if (this.e > 0) {
/*  36 */       this.e -= 1;
/*  37 */       return;
/*     */     }
/*  39 */     if ((paramInt1 == this.g) && (paramInt2 == this.h) && (paramInt3 == this.i)) {
/*  40 */       int j = this.b.a(paramInt1, paramInt2, paramInt3);
/*  41 */       if (j == 0) return;
/*  42 */       fw localfw = fw.n[j];
/*     */ 
/*  44 */       this.d += localfw.a(this.a);
/*     */ 
/*  46 */       this.f += 1.0F;
/*     */ 
/*  48 */       if (this.d >= 1.0F) {
	Block block = etc.getServer().getBlockAt(paramInt1, paramInt2, paramInt3);
                  if (!(Boolean) etc.getLoader().callHook(PluginLoader.Hook.BLOCK_BROKEN, new Object[]{(eo) a, block})) {
/*  49 */         c(paramInt1, paramInt2, paramInt3);
                  }
/*  50 */         this.d = 0.0F;
/*  51 */         this.c = 0.0F;
/*  52 */         this.f = 0.0F;
/*  53 */         this.e = 5;
/*     */       }
/*     */     } else {
/*  56 */       this.d = 0.0F;
/*  57 */       this.c = 0.0F;
/*  58 */       this.f = 0.0F;
/*  59 */       this.g = paramInt1;
/*  60 */       this.h = paramInt2;
/*  61 */       this.i = paramInt3;
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean b(int paramInt1, int paramInt2, int paramInt3) {
/*  66 */     fw localfw = fw.n[this.b.a(paramInt1, paramInt2, paramInt3)];
/*  67 */     int j = this.b.b(paramInt1, paramInt2, paramInt3);
/*  68 */     boolean bool = this.b.d(paramInt1, paramInt2, paramInt3, 0);
/*  69 */     if ((localfw != null) && (bool)) {
/*  70 */       localfw.a(this.b, paramInt1, paramInt2, paramInt3, j);
/*     */     }
/*  72 */     return bool;
/*     */   }
/*     */ 
/*     */   public boolean c(int paramInt1, int paramInt2, int paramInt3) {
/*  76 */     int j = this.b.a(paramInt1, paramInt2, paramInt3);
/*  77 */     int k = this.b.b(paramInt1, paramInt2, paramInt3);
/*  78 */     boolean bool = b(paramInt1, paramInt2, paramInt3);
/*     */ 
/*  80 */     hh localhh = this.a.G();
/*  81 */     if (localhh != null) {
/*  82 */       localhh.a(j, paramInt1, paramInt2, paramInt3);
/*  83 */       if (localhh.a == 0) {
/*  84 */         localhh.a(this.a);
/*  85 */         this.a.H();
/*     */       }
/*     */     }
/*  88 */     if ((bool) && (this.a.b(fw.n[j]))) fw.n[j].a_(this.b, paramInt1, paramInt2, paramInt3, k);
/*  89 */     return bool;
/*     */   }
/*     */ 
/*     */   public boolean a(ft paramft, el paramel, hh paramhh, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  97 */     int j = paramel.a(paramInt1, paramInt2, paramInt3);
/*  98 */     if ((j > 0) && 
/*  99 */       (fw.n[j].a(paramel, paramInt1, paramInt2, paramInt3, paramft))) return true;
/*     */ 
/* 101 */     if (paramhh == null) return false;
/* 102 */     return paramhh.a(paramft, paramel, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */ }

/* Location:           /Minecraft/server/bin/minecraft_server.jar
 * Qualified Name:     jo
 * JD-Core Version:    0.6.0
 */
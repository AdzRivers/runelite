import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public final class class84 extends Renderable {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 281360143
   )
   int field1356;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -711353479
   )
   int field1358;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1462480755
   )
   int field1359;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -703038725
   )
   int field1360;
   @ObfuscatedName("g")
   boolean field1361;
   @ObfuscatedName("c")
   Sequence field1362;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 559470187
   )
   int field1363;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1185949009
   )
   int field1364;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 895991183
   )
   int field1365;
   @ObfuscatedName("lf")
   static Widget[] field1366;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1056520023
   )
   int field1367;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = -356147281
   )
   @Export("cameraYaw")
   static int cameraYaw;

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(S)LModel;",
      garbageValue = "-1617"
   )
   protected final Model getModel() {
      Spotanim var1 = class100.method1840(this.field1356);
      Model var2;
      if(!this.field1361) {
         var2 = var1.method4358(this.field1363);
      } else {
         var2 = var1.method4358(-1);
      }

      return var2 == null?null:var2;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1625643964"
   )
   final void method1654(int var1) {
      if(!this.field1361) {
         this.field1364 += var1;

         while(this.field1364 > this.field1362.frameLenghts[this.field1363]) {
            this.field1364 -= this.field1362.frameLenghts[this.field1363];
            ++this.field1363;
            if(this.field1363 >= this.field1362.frameIDs.length) {
               this.field1361 = true;
               break;
            }
         }

      }
   }

   class84(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1363 = 0;
      this.field1364 = 0;
      this.field1361 = false;
      this.field1356 = var1;
      this.field1358 = var2;
      this.field1367 = var3;
      this.field1360 = var4;
      this.field1359 = var5;
      this.field1365 = var6 + var7;
      int var8 = class100.method1840(this.field1356).field3340;
      if(var8 != -1) {
         this.field1361 = false;
         this.field1362 = class169.getAnimation(var8);
      } else {
         this.field1361 = true;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(ILScript;ZI)I",
      garbageValue = "-2113735864"
   )
   static int method1656(int var0, Script var1, boolean var2) {
      if(var0 == 5630) {
         Client.field966 = 250;
         return 1;
      } else {
         return 2;
      }
   }
}

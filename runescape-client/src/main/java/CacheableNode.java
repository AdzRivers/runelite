import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gu")
@Implements("CacheableNode")
public class CacheableNode extends Node {
   @ObfuscatedName("ci")
   @Export("previous")
   public CacheableNode previous;
   @ObfuscatedName("cu")
   @Export("next")
   public CacheableNode next;

   @ObfuscatedName("cc")
   public void method3641() {
      if(this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }
}

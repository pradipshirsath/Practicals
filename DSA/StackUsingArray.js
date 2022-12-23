 class Stack
{
  constructor()
  {
    this.items = [];
  
  }
  push(ele)
  {

      this.items.push(ele);
  }
    pop()
    {
      if (this.items.length == 0)
      {
          console.log("Empty Stack");
      }
      else
      {
        console.log("Element  removed = " +this.items.pop());
      }
    }

  Display()
  {
    var str="";
    for(var i =0 ; i<this.lenght;i++)
    str += this.items[i]+"";
    return str;

  }
  length()
    {
      console.log("length of Stack = "+this.items.length)
    }
    search(pos)
    {
      if(pos <= this.items.length)
      {
        console.log("Value at "+pos+" is = "+this.items[pos-1])
      }
      else
      {
        console.log("invalid position")
      }
    }

}
var top = new Stack();
console.log(top);
top.push(10);
top.push(20);
top.push(30);
top.push(40);
console.log("After PUSH...");
console.log(top);
top.pop();
console.log("After POP...");
console.log(top);
top.length();
top.search(3)





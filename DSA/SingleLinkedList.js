class LinkedList
{
  constructor () 
  {
    this.list = null
  }

  create(ele)
  {
    if(!this.list)
    {
      this.list=new newNode(ele)
    }
    else
    {
      let temp=this.list
      while(temp.next!=null)
        temp=temp.next
      temp.next=new newNode(ele)
    }
  }
  insert(ele, pos)
  {
    var node=new newNode(ele)
    if(pos==1)
    {
      node.next=this.list
      this.list=node
    }
    else
    {
      var temp=this.list
      var i=2
      while(i!=pos && temp.next!=null)
      {
        temp=temp.next
        i=i+1 
      }
      node.next=temp.next
      temp.next=node
    }
  }

  del(ele)
  {
    let temp=this.list
  	let prev=null
  	
  	while(temp.data!=ele && temp.next!=null)
  	{
  		prev=temp
  		temp=temp.next
  	}
	if(temp.data==ele)
	{
		if(temp!=null)
		{
			if(prev!=null) 
				prev.next=temp.next
		}
		else
				this.list=this.list.next
		temp=null
	}
	else
		console.log("Element not present")
  }
  reverse()
  {
    var forward=this.list
    var curr=null
    var back=null
    while(forward)
    {
      back=curr
      curr=forward
      forward=forward.next
      curr.next=back
    }
    this.list=curr
  }
  search(pos)
  {
    var temp=this.list
    if(pos==1)
    {
      console.log("value at "+pos+" is = "+temp.data)
    }
    else
    {
      
      var i=2
      while(i!=pos && temp.next!=null)
      {
        temp=temp.next
        i=i+1 
      }
      console.log("value at "+pos+" is = "+temp.next.data)
    }
  }

  getcount()
    {
      var count =0
      var temp=this.list
   while(temp!=null)
    {
     
     temp=temp.next
     count++
   }
    console.log(count)
 }

  display()
  {
    
      var temp=this.list
      while(temp!=null)
      {
        console.log(temp.data)
        temp=temp.next
      }
  }
}
  
class newNode 
{
  constructor (data, next) 
  {
    this.data = data
    this.next = null
  }
}

const list = new LinkedList()
list.create(1)
list.create(2)
list.create(3)


console.log("List Created...")
list.display()
list.insert(10,1)
list.insert(20,2)
list.insert(30,3)
list.insert(40,500)
list.insert(50,4)


console.log("After Insert...")
list.display()

console.log("After count...")
list.getcount()
console.log("After Delete...")
list.del(3)
list.del(30)


list.display()

console.log("After search...")
list.search(2)

list.reverse()
console.log("After Reverse...")
list.display()




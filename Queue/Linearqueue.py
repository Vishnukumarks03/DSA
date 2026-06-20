front=rear=-1 
arrsize=4
arr=arrsize*[None] 

def enqueue(item):
    global front,rear,arrsize, arr
    if rear==arrsize-1:
       print("Queue full")

    elif front==-1 and rear==-1:
        rear=0
        front=0         
        arr[front]=item
    else:
       rear=rear+1 
       arr[rear]=item

def dequeue():
    global front,rear,arrsize, arr
    if front==-1 and rear==-1:
        print("Queue empty")
    elif front==rear:
        front=rear=-1
    else:
        front=front+1

def display():
    global front,rear,arrsize, arr
    if front==-1 and rear==-1:
        print("Queue empty")
    
    else:
        for i in range(front,rear+1):
            print(arr[i])

enqueue(1)
enqueue(2)
enqueue(3)
enqueue(4)
display()
dequeue()
dequeue()
dequeue()
display()
enqueue(7)
enqueue(9)
display()

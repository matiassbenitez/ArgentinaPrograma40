let numeros= [];
let aa = [0,2,3,5,7];
let bb = [1,4,6,8,9];

for (let i = 0; i < 50; i++) 
{
    numeros.push(Math.floor(Math.random()*50)+1);    
}


function mergeSort(arr)
{
    if (arr.length == 1)
    {
        return arr;
    }
    else{
        let arr1 = arr.slice(0,arr.length/2);
        let arr2 = arr.slice(arr.length/2);
        return merge(mergeSort(arr1),mergeSort(arr2));
    }
}

function merge(arr1, arr2)
{
    let a = arr1.slice();
    let b = arr2.slice();
    let sorted = [];
    for (let i = 0; i < a.length; i++) 
    {
        if (a[i] <= b[0])
        {
            sorted.push(a[i]);
            if (i == a.length - 1)
            {
                while (b.length > 0)
                {
                    sorted.push(b[0]);
                    b.shift();
                }
            }
        }
        else
        {
            while (a[i] > b[0] && b.length > 0)
            {
                sorted.push(b[0]);
                b.shift();
            }
            sorted.push(a[i]);
            if (i == a.length - 1)
            {
                while (b.length > 0)
                {
                    sorted.push(b[0]);
                    b.shift();
                }
            }
        } 
    }
    return sorted;
}
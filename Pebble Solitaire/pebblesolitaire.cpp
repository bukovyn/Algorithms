#include <iostream>
#include <cstring>
#include <string>
int pebbleCounter;
int arraySize = 27;
int instanceLength = 12;

void calculateInstance(char instance[])
{
    int minPebbles = 0;
    char recursiveInstance[arraySize];
    for(int x = 0; x < arraySize; x++)
    {
        recursiveInstance[x] = instance[x];
    }
    
    
    for(int x = 0; x < instanceLength - 1; x++)
    {
        if(instance[x+1] == 'o' && instance[x] == 'o')
        {
            if(x+2 < 12 && instance[x+2] == '-')
            {
                instance[x] = '-';
                instance[x+1] = '-';
                instance[x+2] = 'o';
                
                calculateInstance(instance);
                
                for(int y = 0; y < arraySize; y++)
                {
                    instance[y] = recursiveInstance[y];
                }
            }
            
            if(x-1 >= 0 && instance[x-1] == '-' ) 
            {
                instance[x-1] = 'o';
                instance[x] = '-';
                instance[x+1] = '-';
                
                calculateInstance(instance);
                
                for(int y = 0; y < arraySize; y++)
                {
                    instance[y] = recursiveInstance[y];
                }
            }
        }
    }
 
 
    for(int x = 0; x < instanceLength; x++) 
    {
        if (instance[x] == 'o')
        {
            minPebbles += 1;
        }
        else
        {
            continue;
        }
    }
 
    if (minPebbles <= pebbleCounter - 1)
    {
        pebbleCounter = minPebbles;
    }
    else
    {
        pebbleCounter = pebbleCounter;
    }
}
 
int main ()
{
    int scenarios = 0;
    scanf("%d", &scenarios);
    for(scenarios; scenarios > 0; scenarios--)
    {
        char instance[arraySize];
        scanf("%s",instance);
        
        if(sizeof(instance) <= arraySize)
        {
            pebbleCounter = sizeof(instance);
            calculateInstance(instance);
            printf("%d \n",pebbleCounter);
        }
    }
    return 0;
}
# -*- coding: utf-8 -*-
"""
Created on Fri Aug 20 14:00:55 2021

@author: Debanjan Rudra
"""

if __name__=='__main__':
    
    for _ in range(int(input())):
        
        n , m = map(int, input().split())
        
        A = list(map(int,input().rstrip().split()))
        
        B = list(map(int,input().rstrip().split()))
        
        new = []
        
        new = A+B
        
        new = set(new)
        
        print(len(new))
        
        
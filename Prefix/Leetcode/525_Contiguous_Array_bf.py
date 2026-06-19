class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
          count0=0
          count1=0
          maxlen=0
          for i in range(len(nums)):
            for j in range(i,len(nums)):
              if nums[j] == 0:
                count0=count0+1
              else: 
                count1=count1+1
              if count0==count1:
                maxlen= max(j-i+1,maxlen)
            count0=0
            count1=0
          return maxlen        
                

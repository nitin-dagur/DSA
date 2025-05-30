class Solution(object):
    def flipAndInvertImage(self, image):
        """
        :type image: List[List[int]]
        :rtype: List[List[int]]
        """
        for row in image:
            for i in range((len(row) + 1) // 2):
                # Swap and invert elements
                row[i], row[-1 - i] = 1 - row[-1 - i], 1 - row[i]
        return image
     

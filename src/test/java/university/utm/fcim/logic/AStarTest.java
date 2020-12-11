package university.utm.fcim.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import university.utm.fcim.ui.Block;

import java.util.Arrays;
import java.util.List;

public class AStarTest {

    @Test
    public void testAStarAlgorithm(){
        AStar aStar = new AStar();
        aStar.setData(5, 5, new Node(2, 0),
                new Node(1, 4));


        int [] w1 = {1, 2};
        int [] w2 = {2, 2};
        int [] w3 = {3, 2};

        int[][] blocksArray = {w1, w2, w3};

        aStar.setBlocks(blocksArray);
        List<Node> path = aStar.findPath();

        List<Node> expectedPath = Arrays.asList(
                new Node(2, 0),
                new Node (1, 1),
                new Node (0, 2),
                new Node(0, 3),
                new Node (1, 4)
        );

        Assertions.assertEquals(expectedPath.size(), path.size());

        int size = path.size();

        for (int i = 0; i < size; i++) {
            Assertions.assertEquals(expectedPath.get(i), path.get(i));
        }

    }


}

package groovy.com.alphacoder.array

import com.alphacoder.array.TargetSum
import spock.lang.Specification

class TargetSumTest extends Specification{

    def 'Test TargetSum | returnIndicesWithTwoForLoops | input arr empty'(){
        given:
        def arr= new int[0]
        def target= 5

        when:
        TargetSum.returnIndicesWithTwoForLoops(arr, target)

        then:
        thrown(RuntimeException)
    }

    def 'Test TargetSum | returnIndicesWithTwoForLoops | input arr has one element'(){
        given:
        def arr= new int[] {1}
        def target= 5

        when:
        TargetSum.returnIndicesWithTwoForLoops(arr, target)

        then:
        thrown(RuntimeException)
    }

    def 'Test TargetSum | returnIndicesWithTwoForLoops | input arr does not have target sum'(){
        given:
        def arr= new int[] {1, 2}
        def target= 5

        when:
        TargetSum.returnIndicesWithTwoForLoops(arr, target)

        then:
        thrown(RuntimeException)
    }

    def 'Test TargetSum | returnIndicesWithTwoForLoops | input arr have target sum'(){
        given:
        def arr= new int[] {1, 2, 3}
        def target= 5

        when:
        def indices=TargetSum.returnIndicesWithTwoForLoops(arr, target)

        then:
        indices.size()== 2
        indices.contains(1)
        indices.contains(2)

    }

    def 'Test TargetSum | returnIndicesWithSorting | input arr empty'(){
        given:
        def arr= new int[0]
        def target= 5

        when:
        TargetSum.returnIndicesWithTwoForLoops(arr, target)

        then:
        thrown(RuntimeException)
    }

    def 'Test TargetSum | returnIndicesWithSorting | input arr has one element'(){
        given:
        def arr= new int[] {1}
        def target= 5

        when:
        TargetSum.returnIndicesWithTwoForLoops(arr, target)

        then:
        thrown(RuntimeException)
    }

    def 'Test TargetSum | returnIndicesWithSorting | input arr does not have target sum'(){
        given:
        def arr= new int[] {1, 2}
        def target= 5

        when:
        TargetSum.returnIndicesWithTwoForLoops(arr, target)

        then:
        thrown(RuntimeException)
    }

    def 'Test TargetSum | returnIndicesWithSorting | input arr have target sum'(){
        given:
        def arr= new int[] {1, 2, 3}
        def target= 5

        when:
        def indices=TargetSum.returnIndicesWithTwoForLoops(arr, target)

        then:
        indices.size()== 2
        indices.contains(1)
        indices.contains(2)

    }
}

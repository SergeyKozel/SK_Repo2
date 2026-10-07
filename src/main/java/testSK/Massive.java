package testSK;

import java.util.ArrayList;
import java.util.List;

public class Massive {
    public List<String> intersection(List<String> m1, List<String> m2) {
        List<String> resultTesters = new ArrayList<String>();
        for (int i = 0; i < m1.size(); i++) {
            for (int z = 0; z < m2.size(); z++) {
                if (m1.get(i).equals(m2.get(z))) {
                    resultTesters.add(m1.get(i));
                }
            }
        }
        return resultTesters;
    }

    public List<String> union(List<String> m1, List<String> m2) {
        List<String> resultTesters = new ArrayList<String>();
        resultTesters.addAll(m1);
        boolean isContains;
        for (int z = 0; z < m2.size(); z++) {
            isContains = false;
            for (int i = 0; i < m1.size(); i++) {
                if (m1.get(i).equals(m2.get(z))) {
                    isContains = true;
                }
            }
            if (!isContains) {
                resultTesters.add(m2.get(z));
            }

        }
        return resultTesters;
    }

    public List<String> symmetricDiff(List<String> m1, List<String> m2) {
        List<String> resultTesters = new ArrayList<String>();
        resultTesters.addAll(m1);
        boolean isContains;
        for (int z = 0; z < m2.size(); z++) {
            isContains = false;
            for (int i = 0; i < m1.size(); i++) {
                if (m1.get(i).equals(m2.get(z))) {
                    isContains = true;
                    resultTesters.remove(m2.get(z));
                }
            }
            if (!isContains) {
                resultTesters.add(m2.get(z));
            }

        }
        return resultTesters;


    }

    public List<String> subtract(List<String> m1, List<String> m2) {
        List<String> resultTesters = new ArrayList<String>();
        resultTesters.addAll(m1);
        boolean isContains;
        for (int z = 0; z < m2.size(); z++) {
            isContains = false;
            for (int i = 0; i < m1.size(); i++) {
                if (m1.get(i).equals(m2.get(z))) {
                    isContains = true;
                    resultTesters.remove(m2.get(z));
                }
            }

        }
        return resultTesters;


    }


}
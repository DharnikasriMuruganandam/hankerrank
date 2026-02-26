Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                BigDecimal ad = new BigDecimal(a);
                BigDecimal bd = new BigDecimal(b);
                return bd.compareTo(ad);
            }
        });



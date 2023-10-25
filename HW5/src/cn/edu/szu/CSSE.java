package cn.edu.szu;

public class CSSE {
    private final Institute[] institutes;
    private final Department[] departments;
    private final Office[] offices;
    private final EditorialOffices editorialOffices;
    private final Lab lab;

    public CSSE() {
        institutes = new Institute[9];
        for (int i = 0; i < institutes.length; i++) {
            institutes[i] = new Institute();
        }
        institutes[0].name = "高性能计算研究所";
        institutes[1].name = "大数据技术与应用研究所";
        institutes[2].name = "未来媒体技术与计算研究所";
        institutes[3].name = "网络与信息安全研究所";
        institutes[4].name = "计算机视觉研究所";
        institutes[5].name = "可是计算研究中心";
        institutes[6].name = "物联网研究中心";
        institutes[7].name = "智能技术与系统集成研究中心";
        institutes[8].name = "软件工程研究中心";

        departments = new Department[4];
        for (int j = 0; j < departments.length; j++) {
            departments[j] = new Department();
        }
        departments[0].name = "计算机科学与技术系";
        departments[1].name = "软件工程系";
        departments[2].name = "网络工程系";
        departments[3].name = "人工智能系";

        offices = new Office[4];
        for (int i = 0; i < offices.length; i++) {
            offices[i] = new Office();
        }
        offices[0].name = "党务工作";
        offices[1].name = "教学业务";
        offices[2].name = "实验教学中心";
        offices[3].name = "辅导员";

        editorialOffices = new EditorialOffices();
        lab = new Lab();
    }

    public void getInstituteNames() {
        for (Institute institute : institutes) {
            System.out.println(institute.name);
        }
    }

    public void getDepartmentNames() {
        for (Department department : departments) {
            System.out.println(department.name);
        }
    }

    public void getOfficeNames() {
        for (Office office : offices) {
            System.out.println(office.name);
        }
    }

    public void getLabName() {
        System.out.println(lab.name);
    }

    public void getInstituteNumber() {
        System.out.println(institutes.length);
    }

    public void getDepartmentNumber() {
        System.out.println(departments.length);
    }

    public void getOfficeNumber() {
        System.out.println(offices.length);
    }

    public void getEditorialOfficesIntro() {
        System.out.println(editorialOffices.intro);
    }

    // 以下为各大机构的类
    private static class Department {
        String name;
    }

    private static class Institute {
        String name;
    }

    private static class Office {
        String name;
    }

    private static class EditorialOffices {
        String intro;

        EditorialOffices() {
            intro = """
                    《机器学习与控制论国际期刊》由Springer出版社发行，于2009年创刊，并于2010年发行了第一卷第一期，并被科学引用文献索引（SCIE）、
                    期刊引用报告科学版（JCR）、期刊题录快讯数据库工程计算与技术版（CC）检索和收录。截至2023年7月，期刊共发行14卷110期，共1782篇文章。
                    王熙照教授自机器学习与控制论国际期刊创刊至今一直担任该期刊的主编。《机器学习与控制论国际期刊》主要关注机器学习与控制论交叉领域出现的关
                    键研究问题，并作为该领域快速传播并更新进展的广泛论坛。有关于机器学习和控制论领域的新想法、设计方案、应用以及实例研究都属于期刊的范畴。""";
        }
    }

    private static class Lab {
        String name;

        Lab() {
            name = "大数据系统计算技术国家工程实验室";
        }
    }
}

package Heroes;

public class ShadowHeroes {

    public static Faction shadow = new Faction("Shadow");

    /**
     * 3 Stars
     */

    public static Heroes chainHammer_3 = new Heroes("Chain Hammer", shadow, 3, "heroes/chainHammer_3.png");
    public static Heroes darkPriest_3 = new Heroes("Dark Priest", shadow, 3, "heroes/darkPriest_3.png");
    public static Heroes iceTroll_3 = new Heroes("Ice Troll", shadow, 3, "heroes/iceTroll_3.png");
    public static Heroes poisonTongue_3 = new Heroes("Poison Tongue", shadow, 3, "heroes/poisonTongue_3.png");
    public static Heroes shirley_3 = new Heroes("Shirley", shadow, 3, "heroes/shirley_3.png");

    /**
     * 4 Stars
     */

    public static Fodder fodder_4 = new Fodder(shadow, 4, "heroes/FortressHolder-3-icon.png");
    public static Heroes boneGeneral_4 = new Heroes("Bone General", shadow, 4, "heroes/boneGeneral_4.png");
    public static Heroes bonecarver_4 = new Heroes("Bonecarver", shadow, 4, "heroes/boneCarver_4.png");
    public static Heroes deathsworn_4 = new Heroes("Deathsworn", shadow, 4, "heroes/deathsworn_4.png");
    public static Heroes gbagbo_4 = new Heroes("Gbagbo", shadow, 4, "heroes/gbagbo_4.png");
    public static Heroes glen_4 = new Heroes("Glen", shadow, 4, "heroes/glen_4.png");
    public static Heroes grumpyCorpse_4 = new Heroes("Grumpy Corpse", shadow, 4, "heroes/grumpyCorpse_4.png");
    public static Heroes lamb_4 = new Heroes("Lamb", shadow, 4, "heroes/lamb_4.png");
    public static Heroes nightmareKnight_4 = new Heroes("Nightmare Knight", shadow, 4, "heroes/nightmareKnight_4.png");

    /**
     * 5 Stars
     */

    public static Fodder fodder_5 = new Fodder(shadow, 5, "heroes/FortressHolder-3-icon.png");
    public static Heroes aidan_5 = new Heroes("Aidan", shadow, 5, ShadowHeroes.aidan_6, "heroes/aidan_5.png");
    public static Heroes baade_5 = new Heroes("Baade", shadow, 5, ShadowHeroes.baade_6, "heroes/baade_5.png");
    public static Heroes bloodBlade_5 = new Heroes("Blood Blade", shadow, 5, ShadowHeroes.bloodBlade_6, "heroes/bloodBlade_5.png");
    public static Heroes boneGeneral_5 = new Heroes("Bone General", shadow, 5, boneGeneral_4, chainHammer_3, fodder_4, "heroes/boneGeneral_5.png");
    public static Heroes bonecarver_5 = new Heroes("Bonecarver", shadow, 5, bonecarver_4, shirley_3, fodder_4, ShadowHeroes.bonecarver_6, "heroes/bonecarver_5.png");
    public static Heroes corpsedemon_5 = new Heroes("Corpsedemon", shadow, 5, ShadowHeroes.corpsedemon_6, "heroes/corpsedemon_5.png");
    public static Heroes deathsworn_5 = new Heroes("Deathsworn", shadow, 5, deathsworn_4, shirley_3, fodder_4, ShadowHeroes.deathsworn_6, "heroes/deathsworn_5.png");
    public static Heroes dominator_5 = new Heroes("Dominator", shadow, 5, ShadowHeroes.dominator_6, "heroes/dominator_5.png");
    public static Heroes field_5 = new Heroes("Field", shadow, 5, ShadowHeroes.field_6, "heroes/field_5.png");
    public static Heroes gbagbo_5 = new Heroes("Gbagbo", shadow, 5, gbagbo_4, poisonTongue_3, fodder_4, "heroes/gbagbo_5.png");
    public static Heroes glen_5 = new Heroes("Glen", shadow, 5, glen_4, darkPriest_3, fodder_4, ShadowHeroes.glen_6, "heroes/glen_5.png");
    public static Heroes grumpyCorpse_5 = new Heroes("Grumpy Corpse", shadow, 5, grumpyCorpse_4, iceTroll_3, fodder_4, "heroes/grumpyCorpse_5.png");
    public static Heroes kamath_5 = new Heroes("Kamath", shadow, 5, ShadowHeroes.kamath_6, "heroes/kamath_5.png");
    public static Heroes kharma_5 = new Heroes("Kharma", shadow, 5, ShadowHeroes.kharma_6, "heroes/kharma_5.png");
    public static Heroes lamb_5 = new Heroes("Lamb", shadow, 5, lamb_4, chainHammer_3, fodder_4, "heroes/lamb_5.png");
    public static Heroes lutz_5 = new Heroes("Lutz", shadow, 5, ShadowHeroes.lutz_6, "heroes/lutz_5.png");
    public static Heroes nightmareKnight_5 = new Heroes("Nightmare Knight", shadow, 5, nightmareKnight_4, iceTroll_3, fodder_4, "heroes/nightmareKnight_5.png");
    public static Heroes walter_5 = new Heroes("Walter", shadow, 5, ShadowHeroes.walter_6, "heroes/walter_5.png");
    public static Heroes jahra_5 = new Heroes("Jahra", shadow, 5, ShadowHeroes.jahra_6, "heroes/jahra_5.png");

    /**
     * 6 Stars
     */

    public static Fodder fodder_6 = new Fodder(shadow, 6, "heroes/FortressHolder-3-icon.png");
    public static Heroes aidan_6 = new Heroes("Aidan", shadow, 6, aidan_5, deathsworn_5, fodder_5, ShadowHeroes.aidan_7, "heroes/aidan_6.png");
    public static Heroes baade_6 = new Heroes("Baade", shadow, 6, baade_5, nightmareKnight_5, fodder_5, ShadowHeroes.baade_7, "heroes/baade_6.png");
    public static Heroes bloodBlade_6 = new Heroes("Blood Blade", shadow, 6, bloodBlade_5, bonecarver_5, fodder_5, ShadowHeroes.bloodBlade_7, "heroes/bloodBlade_6.png");
    public static Heroes bonecarver_6 = new Heroes("Bonecarver", shadow, 6, bonecarver_5, gbagbo_5, fodder_5, ShadowHeroes.bonecarver_7, "heroes/bonecarver_6.png");
    public static Heroes corpsedemon_6 = new Heroes("Corpsedemon", shadow, 6, corpsedemon_5, grumpyCorpse_5, fodder_5, ShadowHeroes.corpsedemon_7, "heroes/corpsedemon_6.png");
    public static Heroes deathsworn_6 = new Heroes("Deathsworn", shadow, 6, deathsworn_5, glen_5, fodder_5, ShadowHeroes.deathsworn_7, "heroes/deathsworn_6.png");
    public static Heroes dominator_6 = new Heroes("Dominator", shadow, 6, dominator_5, boneGeneral_5, fodder_5, ShadowHeroes.dominator_7, "heroes/dominator_6.png");
    public static Heroes field_6 = new Heroes("Field", shadow, 6, field_5, lamb_5, fodder_5, ShadowHeroes.field_7, "heroes/field_6.png");
    public static Heroes glen_6 = new Heroes("Glen", shadow, 6, glen_5, deathsworn_5, fodder_5, ShadowHeroes.glen_7, "heroes/glen_6.png");
    public static Heroes kamath_6 = new Heroes("Kamath", shadow, 6, kamath_5, grumpyCorpse_5, fodder_5, ShadowHeroes.kamath_7, "heroes/kamath_6.png");
    public static Heroes kharma_6 = new Heroes("Kharma", shadow, 6, kharma_5, glen_5, fodder_5, ShadowHeroes.kharma_7, "heroes/kharma_6.png");
    public static Heroes lutz_6 = new Heroes("Lutz", shadow, 6, lutz_5, gbagbo_5, fodder_5, ShadowHeroes.lutz_7, "heroes/lutz_6.png");
    public static Heroes walter_6 = new Heroes("Walter", shadow, 6, walter_5, bonecarver_5, fodder_5, ShadowHeroes.walter_7, "heroes/walter_6.png");
    public static Heroes jahra_6 = new Heroes("Jahra", shadow, 6, jahra_5, lamb_5, fodder_5, ShadowHeroes.jahra_7, "heroes/jahra_5.png");

    /**
     * 7 Stars
     */

    public static Heroes aidan_7 = new Heroes("Aidan", shadow, 7, fodder_5, ShadowHeroes.aidan_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes baade_7 = new Heroes("Baade", shadow, 7, fodder_5, ShadowHeroes.baade_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes bloodBlade_7 = new Heroes("Blood Blade", shadow, 7, fodder_5, ShadowHeroes.bloodBlade_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes bonecarver_7 = new Heroes("Bonecarver", shadow, 7, fodder_5, ShadowHeroes.bonecarver_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes corpsedemon_7 = new Heroes("Corpsedemon", shadow, 7, fodder_5, ShadowHeroes.corpsedemon_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes deathsworn_7 = new Heroes("Deathsworn", shadow, 7, fodder_5, ShadowHeroes.deathsworn_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes dominator_7 = new Heroes("Dominator", shadow, 7, fodder_5, ShadowHeroes.dominator_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes field_7 = new Heroes("Field", shadow, 7, fodder_5, ShadowHeroes.field_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes glen_7 = new Heroes("Glen", shadow, 7, fodder_5, ShadowHeroes.glen_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes kamath_7 = new Heroes("Kamath", shadow, 7, fodder_5, ShadowHeroes.kamath_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes kharma_7 = new Heroes("Kharma", shadow, 7, fodder_5, ShadowHeroes.kharma_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes lutz_7 = new Heroes("Lutz", shadow, 7, fodder_5, ShadowHeroes.lutz_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes walter_7 = new Heroes("Walter", shadow, 7, fodder_5, ShadowHeroes.walter_8, "heroes/FortressHolder-3-icon.png");
    public static Heroes jahra_7 = new Heroes("Jahra", shadow, 7, fodder_5, ShadowHeroes.jahra_8, "heroes/FortressHolder-3-icon.png");

    /**
     * 8 Stars
     */

    public static Heroes aidan_8 = new Heroes("Aidan", shadow, 8, fodder_6, fodder_5, ShadowHeroes.aidan_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes baade_8 = new Heroes("Baade", shadow, 8, fodder_6, fodder_5, ShadowHeroes.baade_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes bloodBlade_8 = new Heroes("Blood Blade", shadow, 8, fodder_6, fodder_5, ShadowHeroes.bloodBlade_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes bonecarver_8 = new Heroes("Bonecarver", shadow, 8, fodder_6, fodder_5, ShadowHeroes.bonecarver_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes corpsedemon_8 = new Heroes("Corpsedemon", shadow, 8, fodder_6, fodder_5, ShadowHeroes.corpsedemon_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes deathsworn_8 = new Heroes("Deathsworn", shadow, 8, fodder_6, fodder_5, ShadowHeroes.deathsworn_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes dominator_8 = new Heroes("Dominator", shadow, 8, fodder_6, fodder_5, ShadowHeroes.dominator_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes field_8 = new Heroes("Field", shadow, 8, fodder_6, fodder_5, ShadowHeroes.field_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes glen_8 = new Heroes("Glen", shadow, 8, fodder_6, fodder_5, ShadowHeroes.glen_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes kamath_8 = new Heroes("Kamath", shadow, 8, fodder_6, fodder_5, ShadowHeroes.kamath_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes kharma_8 = new Heroes("Kharma", shadow, 8, fodder_6, fodder_5, ShadowHeroes.kharma_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes lutz_8 = new Heroes("Lutz", shadow, 8, fodder_6, fodder_5, ShadowHeroes.lutz_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes walter_8 = new Heroes("Walter", shadow, 8, fodder_6, fodder_5, ShadowHeroes.walter_9, "heroes/FortressHolder-3-icon.png");
    public static Heroes jahra_8 = new Heroes("Jahra", shadow, 8, fodder_6, fodder_5, ShadowHeroes.jahra_9, "heroes/FortressHolder-3-icon.png");

    /**
     * 9 Stars
     */

    public static Heroes aidan_9 = new Heroes("Aidan", shadow, 9, aidan_5, fodder_6, fodder_5, ShadowHeroes.aidan_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes baade_9 = new Heroes("Baade", shadow, 9, baade_5, fodder_6, fodder_5, ShadowHeroes.baade_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes bloodBlade_9 = new Heroes("Blood Blade", shadow, 9, bloodBlade_5, fodder_6, fodder_5, ShadowHeroes.bloodBlade_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes bonecarver_9 = new Heroes("Bonecarver", shadow, 9, bonecarver_5, fodder_6, fodder_5, "heroes/FortressHolder-3-icon.png");
    public static Heroes corpsedemon_9 = new Heroes("Corpsedemon", shadow, 9, corpsedemon_5, fodder_6, fodder_5, ShadowHeroes.corpsedemon_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes deathsworn_9 = new Heroes("Deathsworn", shadow, 9, deathsworn_5, fodder_6, fodder_5, "heroes/FortressHolder-3-icon.png");
    public static Heroes dominator_9 = new Heroes("Dominator", shadow, 9, dominator_5, fodder_6, fodder_5, ShadowHeroes.dominator_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes field_9 = new Heroes("Field", shadow, 9, field_5, fodder_6, fodder_5, ShadowHeroes.field_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes glen_9 = new Heroes("Glen", shadow, 9, glen_5, fodder_6, fodder_5, "heroes/FortressHolder-3-icon.png");
    public static Heroes kamath_9 = new Heroes("Kamath", shadow, 9, kamath_5, fodder_6, fodder_5, ShadowHeroes.kamath_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes kharma_9 = new Heroes("Kharma", shadow, 9, kharma_5, fodder_6, fodder_5, ShadowHeroes.kharma_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes lutz_9 = new Heroes("Lutz", shadow, 9, lutz_5, fodder_6, fodder_5, ShadowHeroes.lutz_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes walter_9 = new Heroes("Walter", shadow, 9, walter_5, fodder_6, fodder_5, ShadowHeroes.walter_10, "heroes/FortressHolder-3-icon.png");
    public static Heroes jahra_9 = new Heroes("Jahra", shadow, 9, jahra_5, fodder_6, fodder_5, ShadowHeroes.jahra_10, "heroes/FortressHolder-3-icon.png");

    /**
     * 10 Stars
     */

    public static Heroes aidan_10 = new Heroes("Aidan", shadow, 10, aidan_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.aidan_11, "heroes/aidan_10.png");
    public static Heroes baade_10 = new Heroes("Baade", shadow, 10, baade_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.baade_11, "heroes/baade_10.png");
    public static Heroes bloodBlade_10 = new Heroes("Blood Blade", shadow, 10, bloodBlade_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.bloodBlade_11, "heroes/bloodBlade_10.png");
    public static Heroes corpsedemon_10 = new Heroes("Corpsedemon", shadow, 10, corpsedemon_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.corpsedemon_11, "heroes/corpsedemon_10.png");
    public static Heroes dominator_10 = new Heroes("Dominator", shadow, 10, dominator_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.dominator_11, "heroes/dominator_10.png");
    public static Heroes field_10 = new Heroes("Field", shadow, 10, field_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.field_11, "heroes/field_10.png");
    public static Heroes kamath_10 = new Heroes("Kamath", shadow, 10, kamath_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.kamath_11, "heroes/kamath_10.png");
    public static Heroes kharma_10 = new Heroes("Kharma", shadow, 10, kharma_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.kharma_11, "heroes/kharma_10.png");
    public static Heroes lutz_10 = new Heroes("Lutz", shadow, 10, lutz_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.lutz_11, "heroes/lutz_10.png");
    public static Heroes walter_10 = new Heroes("Walter", shadow, 10, walter_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.walter_11, "heroes/walter_10.png");
    public static Heroes jahra_10 = new Heroes("Jahra", shadow, 10, jahra_5, fodder_6, Heroes_NineStars.fodder, ShadowHeroes.jahra_11, "heroes/jahra_10.png");

    /**
     * 11 Stars
     */

    public static Heroes aidan_11 = new Heroes("Aidan", shadow, 11, aidan_5, Heroes_NineStars.fodder, ShadowHeroes.aidan_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes baade_11 = new Heroes("Baade", shadow, 11, baade_5, Heroes_NineStars.fodder, ShadowHeroes.baade_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes bloodBlade_11 = new Heroes("Blood Blade", shadow, 11, bloodBlade_5, Heroes_NineStars.fodder, ShadowHeroes.bloodBlade_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes corpsedemon_11 = new Heroes("Corpsedemon", shadow, 11, corpsedemon_5, Heroes_NineStars.fodder, ShadowHeroes.corpsedemon_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes dominator_11 = new Heroes("Dominator", shadow, 11, dominator_5, Heroes_NineStars.fodder, ShadowHeroes.dominator_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes field_11 = new Heroes("Field", shadow, 11, field_5, Heroes_NineStars.fodder, ShadowHeroes.field_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes kamath_11 = new Heroes("Kamath", shadow, 11, kamath_5, Heroes_NineStars.fodder, ShadowHeroes.kamath_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes kharma_11 = new Heroes("Kharma", shadow, 11, kharma_5, Heroes_NineStars.fodder, ShadowHeroes.kharma_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes lutz_11 = new Heroes("Lutz", shadow, 11, lutz_5, Heroes_NineStars.fodder, ShadowHeroes.lutz_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes walter_11 = new Heroes("Walter", shadow, 11, walter_5, Heroes_NineStars.fodder, ShadowHeroes.walter_12, "heroes/FortressHolder-3-icon.png");
    public static Heroes jahra_11 = new Heroes("Jahra", shadow, 11, jahra_5, Heroes_NineStars.fodder, ShadowHeroes.jahra_12, "heroes/FortressHolder-3-icon.png");

    /**
     * 12 Stars
     */

    public static Heroes aidan_12 = new Heroes("Aidan", shadow, 12, aidan_5, Heroes_NineStars.fodder, ShadowHeroes.aidan_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes baade_12 = new Heroes("Baade", shadow, 12, baade_5, Heroes_NineStars.fodder, ShadowHeroes.baade_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes bloodBlade_12 = new Heroes("Blood Blade", shadow, 12, bloodBlade_5, Heroes_NineStars.fodder, ShadowHeroes.bloodBlade_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes corpsedemon_12 = new Heroes("Corpsedemon", shadow, 12, corpsedemon_5, Heroes_NineStars.fodder, ShadowHeroes.corpsedemon_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes dominator_12 = new Heroes("Dominator", shadow, 12, dominator_5, Heroes_NineStars.fodder, ShadowHeroes.dominator_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes field_12 = new Heroes("Field", shadow, 12, field_5, Heroes_NineStars.fodder, ShadowHeroes.field_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes kamath_12 = new Heroes("Kamath", shadow, 12, kamath_5, Heroes_NineStars.fodder, ShadowHeroes.kamath_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes kharma_12 = new Heroes("Kharma", shadow, 12, kharma_5, Heroes_NineStars.fodder, ShadowHeroes.kharma_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes lutz_12 = new Heroes("Lutz", shadow, 12, lutz_5, Heroes_NineStars.fodder, ShadowHeroes.lutz_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes walter_12 = new Heroes("Walter", shadow, 12, walter_5, Heroes_NineStars.fodder, ShadowHeroes.walter_13, "heroes/FortressHolder-3-icon.png");
    public static Heroes jahra_12 = new Heroes("Jahra", shadow, 12, jahra_5, Heroes_NineStars.fodder, ShadowHeroes.jahra_13, "heroes/FortressHolder-3-icon.png");

    /**
     * 13 Stars
     */

    public static Heroes aidan_13 = new Heroes("Aidan", shadow, 13, Heroes_TenStars.fodder, "heroes/FortressHolder-3-icon.png");
    public static Heroes baade_13 = new Heroes("Baade", shadow, 13, Heroes_TenStars.fodder, "heroes/FortressHolder-3-icon.png");
    public static Heroes bloodBlade_13 = new Heroes("Blood Blade", shadow, 13, Heroes_TenStars.fodder, "heroes/FortressHolder-3-icon.png");
    public static Heroes corpsedemon_13 = new Heroes("Corpsedemon", shadow, 13, Heroes_TenStars.fodder,  "heroes/FortressHolder-3-icon.png");
    public static Heroes dominator_13 = new Heroes("Dominator", shadow, 13, Heroes_TenStars.fodder, "heroes/FortressHolder-3-icon.png");
    public static Heroes field_13 = new Heroes("Field", shadow, 13, Heroes_TenStars.fodder, "heroes/FortressHolder-3-icon.png");
    public static Heroes kamath_13 = new Heroes("Kamath", shadow, 13, Heroes_TenStars.fodder, "heroes/FortressHolder-3-icon.png");
    public static Heroes kharma_13 = new Heroes("Kharma", shadow, 13, Heroes_TenStars.fodder, "heroes/FortressHolder-3-icon.png");
    public static Heroes lutz_13 = new Heroes("Lutz", shadow, 13, Heroes_TenStars.fodder, "heroes/FortressHolder-3-icon.png");
    public static Heroes walter_13 = new Heroes("Walter", shadow, 13, Heroes_TenStars.fodder, "heroes/FortressHolder-3-icon.png");
    public static Heroes jahra_13 = new Heroes("Jahra", shadow, 13, Heroes_TenStars.fodder,"heroes/FortressHolder-3-icon.png");

}

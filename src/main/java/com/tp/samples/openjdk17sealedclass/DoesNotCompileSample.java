package com.tp.samples.openjdk17sealedclass;

public class DoesNotCompileSample {

    public sealed interface Direction {

    }

    public record North() implements Direction {
    }

    public record East() implements Direction {
    }

    public record South() implements Direction {
    }

    public record West() implements Direction {
    }
}

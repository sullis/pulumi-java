// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotOutputContext {
    private final String name;
    private final Integer timeToLiveInSeconds;
    private final Integer turnsToLive;

    @OutputCustomType.Constructor({"name","timeToLiveInSeconds","turnsToLive"})
    private BotOutputContext(
        String name,
        Integer timeToLiveInSeconds,
        Integer turnsToLive) {
        this.name = Objects.requireNonNull(name);
        this.timeToLiveInSeconds = Objects.requireNonNull(timeToLiveInSeconds);
        this.turnsToLive = Objects.requireNonNull(turnsToLive);
    }

    public String getName() {
        return this.name;
    }
    public Integer getTimeToLiveInSeconds() {
        return this.timeToLiveInSeconds;
    }
    public Integer getTurnsToLive() {
        return this.turnsToLive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotOutputContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer timeToLiveInSeconds;
        private Integer turnsToLive;

        public Builder() {
    	      // Empty
        }

        public Builder(BotOutputContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.timeToLiveInSeconds = defaults.timeToLiveInSeconds;
    	      this.turnsToLive = defaults.turnsToLive;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
            this.timeToLiveInSeconds = Objects.requireNonNull(timeToLiveInSeconds);
            return this;
        }

        public Builder setTurnsToLive(Integer turnsToLive) {
            this.turnsToLive = Objects.requireNonNull(turnsToLive);
            return this;
        }

        public BotOutputContext build() {
            return new BotOutputContext(name, timeToLiveInSeconds, turnsToLive);
        }
    }
}

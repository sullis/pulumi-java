// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionImageConfig {
    /**
     * @return Command.
     * 
     */
    private final @Nullable List<String> command;
    /**
     * @return EntryPoint.
     * 
     */
    private final @Nullable List<String> entryPoint;
    /**
     * @return WorkingDirectory.
     * 
     */
    private final @Nullable String workingDirectory;

    @CustomType.Constructor
    private FunctionImageConfig(
        @CustomType.Parameter("command") @Nullable List<String> command,
        @CustomType.Parameter("entryPoint") @Nullable List<String> entryPoint,
        @CustomType.Parameter("workingDirectory") @Nullable String workingDirectory) {
        this.command = command;
        this.entryPoint = entryPoint;
        this.workingDirectory = workingDirectory;
    }

    /**
     * @return Command.
     * 
     */
    public List<String> command() {
        return this.command == null ? List.of() : this.command;
    }
    /**
     * @return EntryPoint.
     * 
     */
    public List<String> entryPoint() {
        return this.entryPoint == null ? List.of() : this.entryPoint;
    }
    /**
     * @return WorkingDirectory.
     * 
     */
    public Optional<String> workingDirectory() {
        return Optional.ofNullable(this.workingDirectory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionImageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> command;
        private @Nullable List<String> entryPoint;
        private @Nullable String workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionImageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.entryPoint = defaults.entryPoint;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = command;
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }
        public Builder entryPoint(@Nullable List<String> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }
        public Builder entryPoint(String... entryPoint) {
            return entryPoint(List.of(entryPoint));
        }
        public Builder workingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }        public FunctionImageConfig build() {
            return new FunctionImageConfig(command, entryPoint, workingDirectory);
        }
    }
}

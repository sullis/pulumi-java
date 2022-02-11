// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FunctionImageConfig {
    private final @Nullable List<String> command;
    private final @Nullable List<String> entryPoint;
    private final @Nullable String workingDirectory;

    @OutputCustomType.Constructor({"command","entryPoint","workingDirectory"})
    private FunctionImageConfig(
        @Nullable List<String> command,
        @Nullable List<String> entryPoint,
        @Nullable String workingDirectory) {
        this.command = command;
        this.entryPoint = entryPoint;
        this.workingDirectory = workingDirectory;
    }

    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }
    public List<String> getEntryPoint() {
        return this.entryPoint == null ? List.of() : this.entryPoint;
    }
    public Optional<String> getWorkingDirectory() {
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

        public Builder setCommand(@Nullable List<String> command) {
            this.command = command;
            return this;
        }

        public Builder setEntryPoint(@Nullable List<String> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder setWorkingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        public FunctionImageConfig build() {
            return new FunctionImageConfig(command, entryPoint, workingDirectory);
        }
    }
}

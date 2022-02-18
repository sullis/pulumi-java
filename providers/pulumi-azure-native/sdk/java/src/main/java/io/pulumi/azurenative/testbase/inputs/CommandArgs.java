// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.azurenative.testbase.enums.Action;
import io.pulumi.azurenative.testbase.enums.ContentType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The command used in the test
 * 
 */
public final class CommandArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommandArgs Empty = new CommandArgs();

    /**
     * The action of the command.
     * 
     */
    @InputImport(name="action", required=true)
    private final Input<Either<String,Action>> action;

    public Input<Either<String,Action>> getAction() {
        return this.action;
    }

    /**
     * Specifies whether to run the command even if a previous command is failed.
     * 
     */
    @InputImport(name="alwaysRun")
    private final @Nullable Input<Boolean> alwaysRun;

    public Input<Boolean> getAlwaysRun() {
        return this.alwaysRun == null ? Input.empty() : this.alwaysRun;
    }

    /**
     * Specifies whether to apply update before the command.
     * 
     */
    @InputImport(name="applyUpdateBefore")
    private final @Nullable Input<Boolean> applyUpdateBefore;

    public Input<Boolean> getApplyUpdateBefore() {
        return this.applyUpdateBefore == null ? Input.empty() : this.applyUpdateBefore;
    }

    /**
     * The content of the command. The content depends on source type.
     * 
     */
    @InputImport(name="content", required=true)
    private final Input<String> content;

    public Input<String> getContent() {
        return this.content;
    }

    /**
     * The type of command content.
     * 
     */
    @InputImport(name="contentType", required=true)
    private final Input<Either<String,ContentType>> contentType;

    public Input<Either<String,ContentType>> getContentType() {
        return this.contentType;
    }

    /**
     * Specifies the max run time of the command.
     * 
     */
    @InputImport(name="maxRunTime")
    private final @Nullable Input<Integer> maxRunTime;

    public Input<Integer> getMaxRunTime() {
        return this.maxRunTime == null ? Input.empty() : this.maxRunTime;
    }

    /**
     * The name of the command.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Specifies whether to restart the VM after the command executed.
     * 
     */
    @InputImport(name="restartAfter")
    private final @Nullable Input<Boolean> restartAfter;

    public Input<Boolean> getRestartAfter() {
        return this.restartAfter == null ? Input.empty() : this.restartAfter;
    }

    /**
     * Specifies whether to run the command in interactive mode.
     * 
     */
    @InputImport(name="runAsInteractive")
    private final @Nullable Input<Boolean> runAsInteractive;

    public Input<Boolean> getRunAsInteractive() {
        return this.runAsInteractive == null ? Input.empty() : this.runAsInteractive;
    }

    /**
     * Specifies whether to run the command as administrator.
     * 
     */
    @InputImport(name="runElevated")
    private final @Nullable Input<Boolean> runElevated;

    public Input<Boolean> getRunElevated() {
        return this.runElevated == null ? Input.empty() : this.runElevated;
    }

    public CommandArgs(
        Input<Either<String,Action>> action,
        @Nullable Input<Boolean> alwaysRun,
        @Nullable Input<Boolean> applyUpdateBefore,
        Input<String> content,
        Input<Either<String,ContentType>> contentType,
        @Nullable Input<Integer> maxRunTime,
        Input<String> name,
        @Nullable Input<Boolean> restartAfter,
        @Nullable Input<Boolean> runAsInteractive,
        @Nullable Input<Boolean> runElevated) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.alwaysRun = alwaysRun;
        this.applyUpdateBefore = applyUpdateBefore;
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.maxRunTime = maxRunTime;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.restartAfter = restartAfter;
        this.runAsInteractive = runAsInteractive;
        this.runElevated = runElevated;
    }

    private CommandArgs() {
        this.action = Input.empty();
        this.alwaysRun = Input.empty();
        this.applyUpdateBefore = Input.empty();
        this.content = Input.empty();
        this.contentType = Input.empty();
        this.maxRunTime = Input.empty();
        this.name = Input.empty();
        this.restartAfter = Input.empty();
        this.runAsInteractive = Input.empty();
        this.runElevated = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,Action>> action;
        private @Nullable Input<Boolean> alwaysRun;
        private @Nullable Input<Boolean> applyUpdateBefore;
        private Input<String> content;
        private Input<Either<String,ContentType>> contentType;
        private @Nullable Input<Integer> maxRunTime;
        private Input<String> name;
        private @Nullable Input<Boolean> restartAfter;
        private @Nullable Input<Boolean> runAsInteractive;
        private @Nullable Input<Boolean> runElevated;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.alwaysRun = defaults.alwaysRun;
    	      this.applyUpdateBefore = defaults.applyUpdateBefore;
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.maxRunTime = defaults.maxRunTime;
    	      this.name = defaults.name;
    	      this.restartAfter = defaults.restartAfter;
    	      this.runAsInteractive = defaults.runAsInteractive;
    	      this.runElevated = defaults.runElevated;
        }

        public Builder setAction(Input<Either<String,Action>> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(Either<String,Action> action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setAlwaysRun(@Nullable Input<Boolean> alwaysRun) {
            this.alwaysRun = alwaysRun;
            return this;
        }

        public Builder setAlwaysRun(@Nullable Boolean alwaysRun) {
            this.alwaysRun = Input.ofNullable(alwaysRun);
            return this;
        }

        public Builder setApplyUpdateBefore(@Nullable Input<Boolean> applyUpdateBefore) {
            this.applyUpdateBefore = applyUpdateBefore;
            return this;
        }

        public Builder setApplyUpdateBefore(@Nullable Boolean applyUpdateBefore) {
            this.applyUpdateBefore = Input.ofNullable(applyUpdateBefore);
            return this;
        }

        public Builder setContent(Input<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Input.of(Objects.requireNonNull(content));
            return this;
        }

        public Builder setContentType(Input<Either<String,ContentType>> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setContentType(Either<String,ContentType> contentType) {
            this.contentType = Input.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder setMaxRunTime(@Nullable Input<Integer> maxRunTime) {
            this.maxRunTime = maxRunTime;
            return this;
        }

        public Builder setMaxRunTime(@Nullable Integer maxRunTime) {
            this.maxRunTime = Input.ofNullable(maxRunTime);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setRestartAfter(@Nullable Input<Boolean> restartAfter) {
            this.restartAfter = restartAfter;
            return this;
        }

        public Builder setRestartAfter(@Nullable Boolean restartAfter) {
            this.restartAfter = Input.ofNullable(restartAfter);
            return this;
        }

        public Builder setRunAsInteractive(@Nullable Input<Boolean> runAsInteractive) {
            this.runAsInteractive = runAsInteractive;
            return this;
        }

        public Builder setRunAsInteractive(@Nullable Boolean runAsInteractive) {
            this.runAsInteractive = Input.ofNullable(runAsInteractive);
            return this;
        }

        public Builder setRunElevated(@Nullable Input<Boolean> runElevated) {
            this.runElevated = runElevated;
            return this;
        }

        public Builder setRunElevated(@Nullable Boolean runElevated) {
            this.runElevated = Input.ofNullable(runElevated);
            return this;
        }

        public CommandArgs build() {
            return new CommandArgs(action, alwaysRun, applyUpdateBefore, content, contentType, maxRunTime, name, restartAfter, runAsInteractive, runElevated);
        }
    }
}

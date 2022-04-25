// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogStreamState extends com.pulumi.resources.ResourceArgs {

    public static final LogStreamState Empty = new LogStreamState();

    /**
     * The Amazon Resource Name (ARN) specifying the log stream.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the log stream.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the log group under which the log stream is to be created.
     * 
     */
    @Import(name="logGroupName")
    private @Nullable Output<String> logGroupName;

    /**
     * @return The name of the log group under which the log stream is to be created.
     * 
     */
    public Optional<Output<String>> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    /**
     * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the log stream. Must not be longer than 512 characters and must not contain `:`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private LogStreamState() {}

    private LogStreamState(LogStreamState $) {
        this.arn = $.arn;
        this.logGroupName = $.logGroupName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogStreamState $;

        public Builder() {
            $ = new LogStreamState();
        }

        public Builder(LogStreamState defaults) {
            $ = new LogStreamState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) specifying the log stream.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) specifying the log stream.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param logGroupName The name of the log group under which the log stream is to be created.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        /**
         * @param logGroupName The name of the log group under which the log stream is to be created.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        /**
         * @param name The name of the log stream. Must not be longer than 512 characters and must not contain `:`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the log stream. Must not be longer than 512 characters and must not contain `:`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LogStreamState build() {
            return $;
        }
    }

}

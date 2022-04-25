// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom action to be executed
 * when an auto heal rule is triggered.
 * 
 */
public final class AutoHealCustomActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoHealCustomActionArgs Empty = new AutoHealCustomActionArgs();

    /**
     * Executable to be run.
     * 
     */
    @Import(name="exe")
    private @Nullable Output<String> exe;

    /**
     * @return Executable to be run.
     * 
     */
    public Optional<Output<String>> exe() {
        return Optional.ofNullable(this.exe);
    }

    /**
     * Parameters for the executable.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return Parameters for the executable.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private AutoHealCustomActionArgs() {}

    private AutoHealCustomActionArgs(AutoHealCustomActionArgs $) {
        this.exe = $.exe;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoHealCustomActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoHealCustomActionArgs $;

        public Builder() {
            $ = new AutoHealCustomActionArgs();
        }

        public Builder(AutoHealCustomActionArgs defaults) {
            $ = new AutoHealCustomActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exe Executable to be run.
         * 
         * @return builder
         * 
         */
        public Builder exe(@Nullable Output<String> exe) {
            $.exe = exe;
            return this;
        }

        /**
         * @param exe Executable to be run.
         * 
         * @return builder
         * 
         */
        public Builder exe(String exe) {
            return exe(Output.of(exe));
        }

        /**
         * @param parameters Parameters for the executable.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for the executable.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        public AutoHealCustomActionArgs build() {
            return $;
        }
    }

}

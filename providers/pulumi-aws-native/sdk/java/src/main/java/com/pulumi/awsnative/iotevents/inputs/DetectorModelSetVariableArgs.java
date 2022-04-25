// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the variable and its new value.
 * 
 */
public final class DetectorModelSetVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorModelSetVariableArgs Empty = new DetectorModelSetVariableArgs();

    /**
     * The new value of the variable.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The new value of the variable.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     * The name of the variable.
     * 
     */
    @Import(name="variableName", required=true)
    private Output<String> variableName;

    /**
     * @return The name of the variable.
     * 
     */
    public Output<String> variableName() {
        return this.variableName;
    }

    private DetectorModelSetVariableArgs() {}

    private DetectorModelSetVariableArgs(DetectorModelSetVariableArgs $) {
        this.value = $.value;
        this.variableName = $.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelSetVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelSetVariableArgs $;

        public Builder() {
            $ = new DetectorModelSetVariableArgs();
        }

        public Builder(DetectorModelSetVariableArgs defaults) {
            $ = new DetectorModelSetVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The new value of the variable.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The new value of the variable.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param variableName The name of the variable.
         * 
         * @return builder
         * 
         */
        public Builder variableName(Output<String> variableName) {
            $.variableName = variableName;
            return this;
        }

        /**
         * @param variableName The name of the variable.
         * 
         * @return builder
         * 
         */
        public Builder variableName(String variableName) {
            return variableName(Output.of(variableName));
        }

        public DetectorModelSetVariableArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            $.variableName = Objects.requireNonNull($.variableName, "expected parameter 'variableName' to be non-null");
            return $;
        }
    }

}

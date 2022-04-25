// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs();

    /**
     * The parameter name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The parameter name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The array of strings.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The array of strings.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs() {}

    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs $;

        public Builder() {
            $ = new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs();
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs defaults) {
            $ = new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param values The array of strings.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The array of strings.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The array of strings.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}

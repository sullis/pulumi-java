// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SourceControlSlotGithubActionConfigurationCodeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceControlSlotGithubActionConfigurationCodeConfigurationArgs Empty = new SourceControlSlotGithubActionConfigurationCodeConfigurationArgs();

    /**
     * The value to use for the Runtime Stack in the workflow file content for code base apps. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="runtimeStack", required=true)
    private Output<String> runtimeStack;

    /**
     * @return The value to use for the Runtime Stack in the workflow file content for code base apps. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> runtimeStack() {
        return this.runtimeStack;
    }

    /**
     * The value to use for the Runtime Version in the workflow file content for code base apps. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="runtimeVersion", required=true)
    private Output<String> runtimeVersion;

    /**
     * @return The value to use for the Runtime Version in the workflow file content for code base apps. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> runtimeVersion() {
        return this.runtimeVersion;
    }

    private SourceControlSlotGithubActionConfigurationCodeConfigurationArgs() {}

    private SourceControlSlotGithubActionConfigurationCodeConfigurationArgs(SourceControlSlotGithubActionConfigurationCodeConfigurationArgs $) {
        this.runtimeStack = $.runtimeStack;
        this.runtimeVersion = $.runtimeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceControlSlotGithubActionConfigurationCodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceControlSlotGithubActionConfigurationCodeConfigurationArgs $;

        public Builder() {
            $ = new SourceControlSlotGithubActionConfigurationCodeConfigurationArgs();
        }

        public Builder(SourceControlSlotGithubActionConfigurationCodeConfigurationArgs defaults) {
            $ = new SourceControlSlotGithubActionConfigurationCodeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param runtimeStack The value to use for the Runtime Stack in the workflow file content for code base apps. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder runtimeStack(Output<String> runtimeStack) {
            $.runtimeStack = runtimeStack;
            return this;
        }

        /**
         * @param runtimeStack The value to use for the Runtime Stack in the workflow file content for code base apps. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder runtimeStack(String runtimeStack) {
            return runtimeStack(Output.of(runtimeStack));
        }

        /**
         * @param runtimeVersion The value to use for the Runtime Version in the workflow file content for code base apps. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * @param runtimeVersion The value to use for the Runtime Version in the workflow file content for code base apps. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        public SourceControlSlotGithubActionConfigurationCodeConfigurationArgs build() {
            $.runtimeStack = Objects.requireNonNull($.runtimeStack, "expected parameter 'runtimeStack' to be non-null");
            $.runtimeVersion = Objects.requireNonNull($.runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
            return $;
        }
    }

}

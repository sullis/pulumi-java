// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs();

    /**
     * Required. The name of the repository.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Required. The name of the repository.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Required. The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required. The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}

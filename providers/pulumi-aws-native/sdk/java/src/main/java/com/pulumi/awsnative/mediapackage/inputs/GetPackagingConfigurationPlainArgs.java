// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPackagingConfigurationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPackagingConfigurationPlainArgs Empty = new GetPackagingConfigurationPlainArgs();

    /**
     * The ID of the PackagingConfiguration.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the PackagingConfiguration.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetPackagingConfigurationPlainArgs() {}

    private GetPackagingConfigurationPlainArgs(GetPackagingConfigurationPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPackagingConfigurationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPackagingConfigurationPlainArgs $;

        public Builder() {
            $ = new GetPackagingConfigurationPlainArgs();
        }

        public Builder(GetPackagingConfigurationPlainArgs defaults) {
            $ = new GetPackagingConfigurationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the PackagingConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetPackagingConfigurationPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}

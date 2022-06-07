// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsManagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSoftwareSourcePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSoftwareSourcePlainArgs Empty = new GetSoftwareSourcePlainArgs();

    /**
     * The OCID of the software source.
     * 
     */
    @Import(name="softwareSourceId", required=true)
    private String softwareSourceId;

    /**
     * @return The OCID of the software source.
     * 
     */
    public String softwareSourceId() {
        return this.softwareSourceId;
    }

    private GetSoftwareSourcePlainArgs() {}

    private GetSoftwareSourcePlainArgs(GetSoftwareSourcePlainArgs $) {
        this.softwareSourceId = $.softwareSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSoftwareSourcePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSoftwareSourcePlainArgs $;

        public Builder() {
            $ = new GetSoftwareSourcePlainArgs();
        }

        public Builder(GetSoftwareSourcePlainArgs defaults) {
            $ = new GetSoftwareSourcePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param softwareSourceId The OCID of the software source.
         * 
         * @return builder
         * 
         */
        public Builder softwareSourceId(String softwareSourceId) {
            $.softwareSourceId = softwareSourceId;
            return this;
        }

        public GetSoftwareSourcePlainArgs build() {
            $.softwareSourceId = Objects.requireNonNull($.softwareSourceId, "expected parameter 'softwareSourceId' to be non-null");
            return $;
        }
    }

}

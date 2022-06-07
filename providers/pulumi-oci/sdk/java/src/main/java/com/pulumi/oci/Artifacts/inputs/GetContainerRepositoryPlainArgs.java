// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Artifacts.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContainerRepositoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContainerRepositoryPlainArgs Empty = new GetContainerRepositoryPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container repository.  Example: `ocid1.containerrepo.oc1..exampleuniqueID`
     * 
     */
    @Import(name="repositoryId", required=true)
    private String repositoryId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container repository.  Example: `ocid1.containerrepo.oc1..exampleuniqueID`
     * 
     */
    public String repositoryId() {
        return this.repositoryId;
    }

    private GetContainerRepositoryPlainArgs() {}

    private GetContainerRepositoryPlainArgs(GetContainerRepositoryPlainArgs $) {
        this.repositoryId = $.repositoryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerRepositoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerRepositoryPlainArgs $;

        public Builder() {
            $ = new GetContainerRepositoryPlainArgs();
        }

        public Builder(GetContainerRepositoryPlainArgs defaults) {
            $ = new GetContainerRepositoryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repositoryId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container repository.  Example: `ocid1.containerrepo.oc1..exampleuniqueID`
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        public GetContainerRepositoryPlainArgs build() {
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            return $;
        }
    }

}

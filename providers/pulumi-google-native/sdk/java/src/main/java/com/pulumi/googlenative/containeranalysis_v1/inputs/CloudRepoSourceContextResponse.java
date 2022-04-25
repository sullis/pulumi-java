// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.AliasContextResponse;
import com.pulumi.googlenative.containeranalysis_v1.inputs.RepoIdResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A CloudRepoSourceContext denotes a particular revision in a Google Cloud Source Repo.
 * 
 */
public final class CloudRepoSourceContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudRepoSourceContextResponse Empty = new CloudRepoSourceContextResponse();

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    @Import(name="aliasContext", required=true)
    private AliasContextResponse aliasContext;

    /**
     * @return An alias, which may be a branch or tag.
     * 
     */
    public AliasContextResponse aliasContext() {
        return this.aliasContext;
    }

    /**
     * The ID of the repo.
     * 
     */
    @Import(name="repoId", required=true)
    private RepoIdResponse repoId;

    /**
     * @return The ID of the repo.
     * 
     */
    public RepoIdResponse repoId() {
        return this.repoId;
    }

    /**
     * A revision ID.
     * 
     */
    @Import(name="revisionId", required=true)
    private String revisionId;

    /**
     * @return A revision ID.
     * 
     */
    public String revisionId() {
        return this.revisionId;
    }

    private CloudRepoSourceContextResponse() {}

    private CloudRepoSourceContextResponse(CloudRepoSourceContextResponse $) {
        this.aliasContext = $.aliasContext;
        this.repoId = $.repoId;
        this.revisionId = $.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudRepoSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudRepoSourceContextResponse $;

        public Builder() {
            $ = new CloudRepoSourceContextResponse();
        }

        public Builder(CloudRepoSourceContextResponse defaults) {
            $ = new CloudRepoSourceContextResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasContext An alias, which may be a branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder aliasContext(AliasContextResponse aliasContext) {
            $.aliasContext = aliasContext;
            return this;
        }

        /**
         * @param repoId The ID of the repo.
         * 
         * @return builder
         * 
         */
        public Builder repoId(RepoIdResponse repoId) {
            $.repoId = repoId;
            return this;
        }

        /**
         * @param revisionId A revision ID.
         * 
         * @return builder
         * 
         */
        public Builder revisionId(String revisionId) {
            $.revisionId = revisionId;
            return this;
        }

        public CloudRepoSourceContextResponse build() {
            $.aliasContext = Objects.requireNonNull($.aliasContext, "expected parameter 'aliasContext' to be non-null");
            $.repoId = Objects.requireNonNull($.repoId, "expected parameter 'repoId' to be non-null");
            $.revisionId = Objects.requireNonNull($.revisionId, "expected parameter 'revisionId' to be non-null");
            return $;
        }
    }

}

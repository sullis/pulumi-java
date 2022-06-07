// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryObjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryObjectArgs Empty = new GetRepositoryObjectArgs();

    /**
     * A filter to return only commits that affect any of the specified paths.
     * 
     */
    @Import(name="filePath")
    private @Nullable Output<String> filePath;

    /**
     * @return A filter to return only commits that affect any of the specified paths.
     * 
     */
    public Optional<Output<String>> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * A filter to return only resources that match the given reference name.
     * 
     */
    @Import(name="refName")
    private @Nullable Output<String> refName;

    /**
     * @return A filter to return only resources that match the given reference name.
     * 
     */
    public Optional<Output<String>> refName() {
        return Optional.ofNullable(this.refName);
    }

    /**
     * Unique repository identifier.
     * 
     */
    @Import(name="repositoryId", required=true)
    private Output<String> repositoryId;

    /**
     * @return Unique repository identifier.
     * 
     */
    public Output<String> repositoryId() {
        return this.repositoryId;
    }

    private GetRepositoryObjectArgs() {}

    private GetRepositoryObjectArgs(GetRepositoryObjectArgs $) {
        this.filePath = $.filePath;
        this.refName = $.refName;
        this.repositoryId = $.repositoryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryObjectArgs $;

        public Builder() {
            $ = new GetRepositoryObjectArgs();
        }

        public Builder(GetRepositoryObjectArgs defaults) {
            $ = new GetRepositoryObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filePath A filter to return only commits that affect any of the specified paths.
         * 
         * @return builder
         * 
         */
        public Builder filePath(@Nullable Output<String> filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param filePath A filter to return only commits that affect any of the specified paths.
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            return filePath(Output.of(filePath));
        }

        /**
         * @param refName A filter to return only resources that match the given reference name.
         * 
         * @return builder
         * 
         */
        public Builder refName(@Nullable Output<String> refName) {
            $.refName = refName;
            return this;
        }

        /**
         * @param refName A filter to return only resources that match the given reference name.
         * 
         * @return builder
         * 
         */
        public Builder refName(String refName) {
            return refName(Output.of(refName));
        }

        /**
         * @param repositoryId Unique repository identifier.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(Output<String> repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param repositoryId Unique repository identifier.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            return repositoryId(Output.of(repositoryId));
        }

        public GetRepositoryObjectArgs build() {
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            return $;
        }
    }

}

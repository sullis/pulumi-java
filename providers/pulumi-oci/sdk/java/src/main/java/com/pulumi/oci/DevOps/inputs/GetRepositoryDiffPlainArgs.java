// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryDiffPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryDiffPlainArgs Empty = new GetRepositoryDiffPlainArgs();

    /**
     * The branch to compare changes against.
     * 
     */
    @Import(name="baseVersion", required=true)
    private String baseVersion;

    /**
     * @return The branch to compare changes against.
     * 
     */
    public String baseVersion() {
        return this.baseVersion;
    }

    /**
     * Path to a file within a repository.
     * 
     */
    @Import(name="filePath", required=true)
    private String filePath;

    /**
     * @return Path to a file within a repository.
     * 
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Boolean to indicate whether to use merge base or most recent revision.
     * 
     */
    @Import(name="isComparisonFromMergeBase")
    private @Nullable Boolean isComparisonFromMergeBase;

    /**
     * @return Boolean to indicate whether to use merge base or most recent revision.
     * 
     */
    public Optional<Boolean> isComparisonFromMergeBase() {
        return Optional.ofNullable(this.isComparisonFromMergeBase);
    }

    /**
     * Unique repository identifier.
     * 
     */
    @Import(name="repositoryId", required=true)
    private String repositoryId;

    /**
     * @return Unique repository identifier.
     * 
     */
    public String repositoryId() {
        return this.repositoryId;
    }

    /**
     * The branch where changes are coming from.
     * 
     */
    @Import(name="targetVersion", required=true)
    private String targetVersion;

    /**
     * @return The branch where changes are coming from.
     * 
     */
    public String targetVersion() {
        return this.targetVersion;
    }

    private GetRepositoryDiffPlainArgs() {}

    private GetRepositoryDiffPlainArgs(GetRepositoryDiffPlainArgs $) {
        this.baseVersion = $.baseVersion;
        this.filePath = $.filePath;
        this.isComparisonFromMergeBase = $.isComparisonFromMergeBase;
        this.repositoryId = $.repositoryId;
        this.targetVersion = $.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryDiffPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryDiffPlainArgs $;

        public Builder() {
            $ = new GetRepositoryDiffPlainArgs();
        }

        public Builder(GetRepositoryDiffPlainArgs defaults) {
            $ = new GetRepositoryDiffPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseVersion The branch to compare changes against.
         * 
         * @return builder
         * 
         */
        public Builder baseVersion(String baseVersion) {
            $.baseVersion = baseVersion;
            return this;
        }

        /**
         * @param filePath Path to a file within a repository.
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param isComparisonFromMergeBase Boolean to indicate whether to use merge base or most recent revision.
         * 
         * @return builder
         * 
         */
        public Builder isComparisonFromMergeBase(@Nullable Boolean isComparisonFromMergeBase) {
            $.isComparisonFromMergeBase = isComparisonFromMergeBase;
            return this;
        }

        /**
         * @param repositoryId Unique repository identifier.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param targetVersion The branch where changes are coming from.
         * 
         * @return builder
         * 
         */
        public Builder targetVersion(String targetVersion) {
            $.targetVersion = targetVersion;
            return this;
        }

        public GetRepositoryDiffPlainArgs build() {
            $.baseVersion = Objects.requireNonNull($.baseVersion, "expected parameter 'baseVersion' to be non-null");
            $.filePath = Objects.requireNonNull($.filePath, "expected parameter 'filePath' to be non-null");
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            $.targetVersion = Objects.requireNonNull($.targetVersion, "expected parameter 'targetVersion' to be non-null");
            return $;
        }
    }

}

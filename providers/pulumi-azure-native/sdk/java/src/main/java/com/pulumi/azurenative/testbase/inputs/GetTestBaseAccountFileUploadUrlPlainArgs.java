// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTestBaseAccountFileUploadUrlPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTestBaseAccountFileUploadUrlPlainArgs Empty = new GetTestBaseAccountFileUploadUrlPlainArgs();

    /**
     * The custom file name of the uploaded blob.
     * 
     */
    @Import(name="blobName")
    private @Nullable String blobName;

    /**
     * @return The custom file name of the uploaded blob.
     * 
     */
    public Optional<String> blobName() {
        return Optional.ofNullable(this.blobName);
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
    private String testBaseAccountName;

    /**
     * @return The resource name of the Test Base Account.
     * 
     */
    public String testBaseAccountName() {
        return this.testBaseAccountName;
    }

    private GetTestBaseAccountFileUploadUrlPlainArgs() {}

    private GetTestBaseAccountFileUploadUrlPlainArgs(GetTestBaseAccountFileUploadUrlPlainArgs $) {
        this.blobName = $.blobName;
        this.resourceGroupName = $.resourceGroupName;
        this.testBaseAccountName = $.testBaseAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTestBaseAccountFileUploadUrlPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTestBaseAccountFileUploadUrlPlainArgs $;

        public Builder() {
            $ = new GetTestBaseAccountFileUploadUrlPlainArgs();
        }

        public Builder(GetTestBaseAccountFileUploadUrlPlainArgs defaults) {
            $ = new GetTestBaseAccountFileUploadUrlPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blobName The custom file name of the uploaded blob.
         * 
         * @return builder
         * 
         */
        public Builder blobName(@Nullable String blobName) {
            $.blobName = blobName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param testBaseAccountName The resource name of the Test Base Account.
         * 
         * @return builder
         * 
         */
        public Builder testBaseAccountName(String testBaseAccountName) {
            $.testBaseAccountName = testBaseAccountName;
            return this;
        }

        public GetTestBaseAccountFileUploadUrlPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.testBaseAccountName = Objects.requireNonNull($.testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
            return $;
        }
    }

}

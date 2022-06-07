// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFoldersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFoldersPlainArgs Empty = new GetFoldersPlainArgs();

    /**
     * A string parent as defined in the [REST API](https://cloud.google.com/resource-manager/reference/rest/v3/folders/list#query-parameters).
     * 
     */
    @Import(name="parentId", required=true)
    private String parentId;

    /**
     * @return A string parent as defined in the [REST API](https://cloud.google.com/resource-manager/reference/rest/v3/folders/list#query-parameters).
     * 
     */
    public String parentId() {
        return this.parentId;
    }

    private GetFoldersPlainArgs() {}

    private GetFoldersPlainArgs(GetFoldersPlainArgs $) {
        this.parentId = $.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFoldersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFoldersPlainArgs $;

        public Builder() {
            $ = new GetFoldersPlainArgs();
        }

        public Builder(GetFoldersPlainArgs defaults) {
            $ = new GetFoldersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parentId A string parent as defined in the [REST API](https://cloud.google.com/resource-manager/reference/rest/v3/folders/list#query-parameters).
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            $.parentId = parentId;
            return this;
        }

        public GetFoldersPlainArgs build() {
            $.parentId = Objects.requireNonNull($.parentId, "expected parameter 'parentId' to be non-null");
            return $;
        }
    }

}

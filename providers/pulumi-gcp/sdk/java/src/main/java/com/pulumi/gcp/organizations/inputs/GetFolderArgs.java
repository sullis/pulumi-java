// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFolderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFolderArgs Empty = new GetFolderArgs();

    /**
     * The name of the Folder in the form `{folder_id}` or `folders/{folder_id}`.
     * 
     */
    @Import(name="folder", required=true)
    private String folder;

    /**
     * @return The name of the Folder in the form `{folder_id}` or `folders/{folder_id}`.
     * 
     */
    public String folder() {
        return this.folder;
    }

    /**
     * `true` to find the organization that the folder belongs, `false` to avoid the lookup. It searches up the tree. (defaults to `false`)
     * 
     */
    @Import(name="lookupOrganization")
    private @Nullable Boolean lookupOrganization;

    /**
     * @return `true` to find the organization that the folder belongs, `false` to avoid the lookup. It searches up the tree. (defaults to `false`)
     * 
     */
    public Optional<Boolean> lookupOrganization() {
        return Optional.ofNullable(this.lookupOrganization);
    }

    private GetFolderArgs() {}

    private GetFolderArgs(GetFolderArgs $) {
        this.folder = $.folder;
        this.lookupOrganization = $.lookupOrganization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFolderArgs $;

        public Builder() {
            $ = new GetFolderArgs();
        }

        public Builder(GetFolderArgs defaults) {
            $ = new GetFolderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param folder The name of the Folder in the form `{folder_id}` or `folders/{folder_id}`.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param lookupOrganization `true` to find the organization that the folder belongs, `false` to avoid the lookup. It searches up the tree. (defaults to `false`)
         * 
         * @return builder
         * 
         */
        public Builder lookupOrganization(@Nullable Boolean lookupOrganization) {
            $.lookupOrganization = lookupOrganization;
            return this;
        }

        public GetFolderArgs build() {
            $.folder = Objects.requireNonNull($.folder, "expected parameter 'folder' to be non-null");
            return $;
        }
    }

}

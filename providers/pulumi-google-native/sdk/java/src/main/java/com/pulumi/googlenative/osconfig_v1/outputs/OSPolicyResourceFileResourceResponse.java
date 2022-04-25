// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceFileResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OSPolicyResourceFileResourceResponse {
    /**
     * @return A a file with this content. The size of the content is limited to 1024 characters.
     * 
     */
    private final String content;
    /**
     * @return A remote or local source.
     * 
     */
    private final OSPolicyResourceFileResponse file;
    /**
     * @return The absolute path of the file within the VM.
     * 
     */
    private final String path;
    /**
     * @return Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users for the file (similarly to the numeric mode used in the linux chmod utility). Each digit represents a three bit number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission. Default behavior is 755. Below are some examples of permissions and their associated values: read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
     * 
     */
    private final String permissions;
    /**
     * @return Desired state of the file.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private OSPolicyResourceFileResourceResponse(
        @CustomType.Parameter("content") String content,
        @CustomType.Parameter("file") OSPolicyResourceFileResponse file,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("permissions") String permissions,
        @CustomType.Parameter("state") String state) {
        this.content = content;
        this.file = file;
        this.path = path;
        this.permissions = permissions;
        this.state = state;
    }

    /**
     * @return A a file with this content. The size of the content is limited to 1024 characters.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return A remote or local source.
     * 
     */
    public OSPolicyResourceFileResponse file() {
        return this.file;
    }
    /**
     * @return The absolute path of the file within the VM.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users for the file (similarly to the numeric mode used in the linux chmod utility). Each digit represents a three bit number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission. Default behavior is 755. Below are some examples of permissions and their associated values: read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
     * 
     */
    public String permissions() {
        return this.permissions;
    }
    /**
     * @return Desired state of the file.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private OSPolicyResourceFileResponse file;
        private String path;
        private String permissions;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.file = defaults.file;
    	      this.path = defaults.path;
    	      this.permissions = defaults.permissions;
    	      this.state = defaults.state;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder file(OSPolicyResourceFileResponse file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public OSPolicyResourceFileResourceResponse build() {
            return new OSPolicyResourceFileResourceResponse(content, file, path, permissions, state);
        }
    }
}

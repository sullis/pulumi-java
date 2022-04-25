// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CIFSMountConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CIFSMountConfigurationArgs Empty = new CIFSMountConfigurationArgs();

    /**
     * These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<String> mountOptions;

    /**
     * @return These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    public Optional<Output<String>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
    private Output<String> relativeMountPath;

    /**
     * @return All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    public Output<String> relativeMountPath() {
        return this.relativeMountPath;
    }

    @Import(name="source", required=true)
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private CIFSMountConfigurationArgs() {}

    private CIFSMountConfigurationArgs(CIFSMountConfigurationArgs $) {
        this.mountOptions = $.mountOptions;
        this.password = $.password;
        this.relativeMountPath = $.relativeMountPath;
        this.source = $.source;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CIFSMountConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CIFSMountConfigurationArgs $;

        public Builder() {
            $ = new CIFSMountConfigurationArgs();
        }

        public Builder(CIFSMountConfigurationArgs defaults) {
            $ = new CIFSMountConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mountOptions These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        /**
         * @param mountOptions These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(String mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param relativeMountPath All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
         * 
         * @return builder
         * 
         */
        public Builder relativeMountPath(Output<String> relativeMountPath) {
            $.relativeMountPath = relativeMountPath;
            return this;
        }

        /**
         * @param relativeMountPath All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
         * 
         * @return builder
         * 
         */
        public Builder relativeMountPath(String relativeMountPath) {
            return relativeMountPath(Output.of(relativeMountPath));
        }

        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public CIFSMountConfigurationArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.relativeMountPath = Objects.requireNonNull($.relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A namespace junction.
 * 
 */
public final class NamespaceJunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceJunctionArgs Empty = new NamespaceJunctionArgs();

    /**
     * Namespace path on a Cache for a Storage Target.
     * 
     */
    @Import(name="namespacePath")
      private final @Nullable Output<String> namespacePath;

    public Output<String> namespacePath() {
        return this.namespacePath == null ? Codegen.empty() : this.namespacePath;
    }

    /**
     * Name of the access policy applied to this junction.
     * 
     */
    @Import(name="nfsAccessPolicy")
      private final @Nullable Output<String> nfsAccessPolicy;

    public Output<String> nfsAccessPolicy() {
        return this.nfsAccessPolicy == null ? Codegen.empty() : this.nfsAccessPolicy;
    }

    /**
     * NFS export where targetPath exists.
     * 
     */
    @Import(name="nfsExport")
      private final @Nullable Output<String> nfsExport;

    public Output<String> nfsExport() {
        return this.nfsExport == null ? Codegen.empty() : this.nfsExport;
    }

    /**
     * Path in Storage Target to which namespacePath points.
     * 
     */
    @Import(name="targetPath")
      private final @Nullable Output<String> targetPath;

    public Output<String> targetPath() {
        return this.targetPath == null ? Codegen.empty() : this.targetPath;
    }

    public NamespaceJunctionArgs(
        @Nullable Output<String> namespacePath,
        @Nullable Output<String> nfsAccessPolicy,
        @Nullable Output<String> nfsExport,
        @Nullable Output<String> targetPath) {
        this.namespacePath = namespacePath;
        this.nfsAccessPolicy = Codegen.stringProp("nfsAccessPolicy").output().arg(nfsAccessPolicy).def("default").getNullable();
        this.nfsExport = nfsExport;
        this.targetPath = targetPath;
    }

    private NamespaceJunctionArgs() {
        this.namespacePath = Codegen.empty();
        this.nfsAccessPolicy = Codegen.empty();
        this.nfsExport = Codegen.empty();
        this.targetPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceJunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> namespacePath;
        private @Nullable Output<String> nfsAccessPolicy;
        private @Nullable Output<String> nfsExport;
        private @Nullable Output<String> targetPath;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceJunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespacePath = defaults.namespacePath;
    	      this.nfsAccessPolicy = defaults.nfsAccessPolicy;
    	      this.nfsExport = defaults.nfsExport;
    	      this.targetPath = defaults.targetPath;
        }

        public Builder namespacePath(@Nullable Output<String> namespacePath) {
            this.namespacePath = namespacePath;
            return this;
        }
        public Builder namespacePath(@Nullable String namespacePath) {
            this.namespacePath = Codegen.ofNullable(namespacePath);
            return this;
        }
        public Builder nfsAccessPolicy(@Nullable Output<String> nfsAccessPolicy) {
            this.nfsAccessPolicy = nfsAccessPolicy;
            return this;
        }
        public Builder nfsAccessPolicy(@Nullable String nfsAccessPolicy) {
            this.nfsAccessPolicy = Codegen.ofNullable(nfsAccessPolicy);
            return this;
        }
        public Builder nfsExport(@Nullable Output<String> nfsExport) {
            this.nfsExport = nfsExport;
            return this;
        }
        public Builder nfsExport(@Nullable String nfsExport) {
            this.nfsExport = Codegen.ofNullable(nfsExport);
            return this;
        }
        public Builder targetPath(@Nullable Output<String> targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public Builder targetPath(@Nullable String targetPath) {
            this.targetPath = Codegen.ofNullable(targetPath);
            return this;
        }        public NamespaceJunctionArgs build() {
            return new NamespaceJunctionArgs(namespacePath, nfsAccessPolicy, nfsExport, targetPath);
        }
    }
}

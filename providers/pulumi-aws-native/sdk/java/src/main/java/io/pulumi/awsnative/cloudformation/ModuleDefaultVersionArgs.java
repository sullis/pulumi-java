// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModuleDefaultVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModuleDefaultVersionArgs Empty = new ModuleDefaultVersionArgs();

    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    @InputImport(name="moduleName")
    private final @Nullable Input<String> moduleName;

    public Input<String> getModuleName() {
        return this.moduleName == null ? Input.empty() : this.moduleName;
    }

    @InputImport(name="versionId")
    private final @Nullable Input<String> versionId;

    public Input<String> getVersionId() {
        return this.versionId == null ? Input.empty() : this.versionId;
    }

    public ModuleDefaultVersionArgs(
        @Nullable Input<String> arn,
        @Nullable Input<String> moduleName,
        @Nullable Input<String> versionId) {
        this.arn = arn;
        this.moduleName = moduleName;
        this.versionId = versionId;
    }

    private ModuleDefaultVersionArgs() {
        this.arn = Input.empty();
        this.moduleName = Input.empty();
        this.versionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleDefaultVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> moduleName;
        private @Nullable Input<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleDefaultVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.moduleName = defaults.moduleName;
    	      this.versionId = defaults.versionId;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setModuleName(@Nullable Input<String> moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        public Builder setModuleName(@Nullable String moduleName) {
            this.moduleName = Input.ofNullable(moduleName);
            return this;
        }

        public Builder setVersionId(@Nullable Input<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = Input.ofNullable(versionId);
            return this;
        }

        public ModuleDefaultVersionArgs build() {
            return new ModuleDefaultVersionArgs(arn, moduleName, versionId);
        }
    }
}

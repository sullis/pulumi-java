// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.qldb;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LedgerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LedgerArgs Empty = new LedgerArgs();

    /**
     * The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> deletionProtection() {
        return this.deletionProtection == null ? Codegen.empty() : this.deletionProtection;
    }

    /**
     * The friendly name for the QLDB Ledger instance. By default generated by this provider.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
     * 
     */
    @Import(name="permissionsMode", required=true)
      private final Output<String> permissionsMode;

    public Output<String> permissionsMode() {
        return this.permissionsMode;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public LedgerArgs(
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> name,
        Output<String> permissionsMode,
        @Nullable Output<Map<String,String>> tags) {
        this.deletionProtection = deletionProtection;
        this.name = name;
        this.permissionsMode = Objects.requireNonNull(permissionsMode, "expected parameter 'permissionsMode' to be non-null");
        this.tags = tags;
    }

    private LedgerArgs() {
        this.deletionProtection = Codegen.empty();
        this.name = Codegen.empty();
        this.permissionsMode = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LedgerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> name;
        private Output<String> permissionsMode;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LedgerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.name = defaults.name;
    	      this.permissionsMode = defaults.permissionsMode;
    	      this.tags = defaults.tags;
        }

        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Codegen.ofNullable(deletionProtection);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder permissionsMode(Output<String> permissionsMode) {
            this.permissionsMode = Objects.requireNonNull(permissionsMode);
            return this;
        }
        public Builder permissionsMode(String permissionsMode) {
            this.permissionsMode = Output.of(Objects.requireNonNull(permissionsMode));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public LedgerArgs build() {
            return new LedgerArgs(deletionProtection, name, permissionsMode, tags);
        }
    }
}

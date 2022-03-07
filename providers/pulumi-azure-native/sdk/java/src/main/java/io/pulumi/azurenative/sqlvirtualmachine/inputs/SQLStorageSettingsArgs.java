// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set disk storage settings for SQL Server.
 * 
 */
public final class SQLStorageSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SQLStorageSettingsArgs Empty = new SQLStorageSettingsArgs();

    /**
     * SQL Server default file path
     * 
     */
    @InputImport(name="defaultFilePath")
      private final @Nullable Input<String> defaultFilePath;

    public Input<String> getDefaultFilePath() {
        return this.defaultFilePath == null ? Input.empty() : this.defaultFilePath;
    }

    /**
     * Logical Unit Numbers for the disks.
     * 
     */
    @InputImport(name="luns")
      private final @Nullable Input<List<Integer>> luns;

    public Input<List<Integer>> getLuns() {
        return this.luns == null ? Input.empty() : this.luns;
    }

    public SQLStorageSettingsArgs(
        @Nullable Input<String> defaultFilePath,
        @Nullable Input<List<Integer>> luns) {
        this.defaultFilePath = defaultFilePath;
        this.luns = luns;
    }

    private SQLStorageSettingsArgs() {
        this.defaultFilePath = Input.empty();
        this.luns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SQLStorageSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultFilePath;
        private @Nullable Input<List<Integer>> luns;

        public Builder() {
    	      // Empty
        }

        public Builder(SQLStorageSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultFilePath = defaults.defaultFilePath;
    	      this.luns = defaults.luns;
        }

        public Builder setDefaultFilePath(@Nullable Input<String> defaultFilePath) {
            this.defaultFilePath = defaultFilePath;
            return this;
        }

        public Builder setDefaultFilePath(@Nullable String defaultFilePath) {
            this.defaultFilePath = Input.ofNullable(defaultFilePath);
            return this;
        }

        public Builder setLuns(@Nullable Input<List<Integer>> luns) {
            this.luns = luns;
            return this;
        }

        public Builder setLuns(@Nullable List<Integer> luns) {
            this.luns = Input.ofNullable(luns);
            return this;
        }
        public SQLStorageSettingsArgs build() {
            return new SQLStorageSettingsArgs(defaultFilePath, luns);
        }
    }
}
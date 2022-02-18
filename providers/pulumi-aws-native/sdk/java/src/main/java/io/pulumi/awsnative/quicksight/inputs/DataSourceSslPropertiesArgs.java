// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Secure Socket Layer (SSL) properties that apply when QuickSight connects to your
 *             underlying data source.</p>
 * 
 */
public final class DataSourceSslPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceSslPropertiesArgs Empty = new DataSourceSslPropertiesArgs();

    /**
     * <p>A Boolean option to control whether SSL should be disabled.</p>
     * 
     */
    @InputImport(name="disableSsl")
    private final @Nullable Input<Boolean> disableSsl;

    public Input<Boolean> getDisableSsl() {
        return this.disableSsl == null ? Input.empty() : this.disableSsl;
    }

    public DataSourceSslPropertiesArgs(@Nullable Input<Boolean> disableSsl) {
        this.disableSsl = disableSsl;
    }

    private DataSourceSslPropertiesArgs() {
        this.disableSsl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSslPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSslPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableSsl = defaults.disableSsl;
        }

        public Builder setDisableSsl(@Nullable Input<Boolean> disableSsl) {
            this.disableSsl = disableSsl;
            return this;
        }

        public Builder setDisableSsl(@Nullable Boolean disableSsl) {
            this.disableSsl = Input.ofNullable(disableSsl);
            return this;
        }

        public DataSourceSslPropertiesArgs build() {
            return new DataSourceSslPropertiesArgs(disableSsl);
        }
    }
}

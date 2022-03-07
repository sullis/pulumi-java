// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A quasi-identifier column has a custom_tag, used to know which column in the data corresponds to which column in the statistical model.
 * 
 */
public final class GooglePrivacyDlpV2QuasiIdFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2QuasiIdFieldArgs Empty = new GooglePrivacyDlpV2QuasiIdFieldArgs();

    /**
     * A auxiliary field.
     * 
     */
    @InputImport(name="customTag")
      private final @Nullable Input<String> customTag;

    public Input<String> getCustomTag() {
        return this.customTag == null ? Input.empty() : this.customTag;
    }

    /**
     * Identifies the column.
     * 
     */
    @InputImport(name="field")
      private final @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field;

    public Input<GooglePrivacyDlpV2FieldIdArgs> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    public GooglePrivacyDlpV2QuasiIdFieldArgs(
        @Nullable Input<String> customTag,
        @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field) {
        this.customTag = customTag;
        this.field = field;
    }

    private GooglePrivacyDlpV2QuasiIdFieldArgs() {
        this.customTag = Input.empty();
        this.field = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2QuasiIdFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customTag;
        private @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2QuasiIdFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTag = defaults.customTag;
    	      this.field = defaults.field;
        }

        public Builder setCustomTag(@Nullable Input<String> customTag) {
            this.customTag = customTag;
            return this;
        }

        public Builder setCustomTag(@Nullable String customTag) {
            this.customTag = Input.ofNullable(customTag);
            return this;
        }

        public Builder setField(@Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable GooglePrivacyDlpV2FieldIdArgs field) {
            this.field = Input.ofNullable(field);
            return this;
        }
        public GooglePrivacyDlpV2QuasiIdFieldArgs build() {
            return new GooglePrivacyDlpV2QuasiIdFieldArgs(customTag, field);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.WorkbookTemplateGalleryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Localized template data and gallery information.
 * 
 */
public final class WorkbookTemplateLocalizedGalleryArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkbookTemplateLocalizedGalleryArgs Empty = new WorkbookTemplateLocalizedGalleryArgs();

    /**
     * Workbook galleries supported by the template.
     * 
     */
    @InputImport(name="galleries")
      private final @Nullable Input<List<WorkbookTemplateGalleryArgs>> galleries;

    public Input<List<WorkbookTemplateGalleryArgs>> getGalleries() {
        return this.galleries == null ? Input.empty() : this.galleries;
    }

    /**
     * Valid JSON object containing workbook template payload.
     * 
     */
    @InputImport(name="templateData")
      private final @Nullable Input<Object> templateData;

    public Input<Object> getTemplateData() {
        return this.templateData == null ? Input.empty() : this.templateData;
    }

    public WorkbookTemplateLocalizedGalleryArgs(
        @Nullable Input<List<WorkbookTemplateGalleryArgs>> galleries,
        @Nullable Input<Object> templateData) {
        this.galleries = galleries;
        this.templateData = templateData;
    }

    private WorkbookTemplateLocalizedGalleryArgs() {
        this.galleries = Input.empty();
        this.templateData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkbookTemplateLocalizedGalleryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WorkbookTemplateGalleryArgs>> galleries;
        private @Nullable Input<Object> templateData;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkbookTemplateLocalizedGalleryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.galleries = defaults.galleries;
    	      this.templateData = defaults.templateData;
        }

        public Builder setGalleries(@Nullable Input<List<WorkbookTemplateGalleryArgs>> galleries) {
            this.galleries = galleries;
            return this;
        }

        public Builder setGalleries(@Nullable List<WorkbookTemplateGalleryArgs> galleries) {
            this.galleries = Input.ofNullable(galleries);
            return this;
        }

        public Builder setTemplateData(@Nullable Input<Object> templateData) {
            this.templateData = templateData;
            return this;
        }

        public Builder setTemplateData(@Nullable Object templateData) {
            this.templateData = Input.ofNullable(templateData);
            return this;
        }
        public WorkbookTemplateLocalizedGalleryArgs build() {
            return new WorkbookTemplateLocalizedGalleryArgs(galleries, templateData);
        }
    }
}
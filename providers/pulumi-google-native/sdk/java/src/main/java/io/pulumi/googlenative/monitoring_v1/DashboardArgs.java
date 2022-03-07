// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.ColumnLayoutArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.GridLayoutArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.MosaicLayoutArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.RowLayoutArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DashboardArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardArgs Empty = new DashboardArgs();

    /**
     * The content is divided into equally spaced columns and the widgets are arranged vertically.
     * 
     */
    @InputImport(name="columnLayout")
      private final @Nullable Input<ColumnLayoutArgs> columnLayout;

    public Input<ColumnLayoutArgs> getColumnLayout() {
        return this.columnLayout == null ? Input.empty() : this.columnLayout;
    }

    /**
     * The mutable, human-readable name.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. An etag is returned in the response to GetDashboard, and users are expected to put that etag in the request to UpdateDashboard to ensure that their change will be applied to the same version of the Dashboard configuration. The field should not be passed during dashboard creation.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Content is arranged with a basic layout that re-flows a simple list of informational elements like widgets or tiles.
     * 
     */
    @InputImport(name="gridLayout")
      private final @Nullable Input<GridLayoutArgs> gridLayout;

    public Input<GridLayoutArgs> getGridLayout() {
        return this.gridLayout == null ? Input.empty() : this.gridLayout;
    }

    /**
     * Labels applied to the dashboard
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The content is arranged as a grid of tiles, with each content widget occupying one or more grid blocks.
     * 
     */
    @InputImport(name="mosaicLayout")
      private final @Nullable Input<MosaicLayoutArgs> mosaicLayout;

    public Input<MosaicLayoutArgs> getMosaicLayout() {
        return this.mosaicLayout == null ? Input.empty() : this.mosaicLayout;
    }

    /**
     * Immutable. The resource name of the dashboard.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The content is divided into equally spaced rows and the widgets are arranged horizontally.
     * 
     */
    @InputImport(name="rowLayout")
      private final @Nullable Input<RowLayoutArgs> rowLayout;

    public Input<RowLayoutArgs> getRowLayout() {
        return this.rowLayout == null ? Input.empty() : this.rowLayout;
    }

    @InputImport(name="validateOnly")
      private final @Nullable Input<String> validateOnly;

    public Input<String> getValidateOnly() {
        return this.validateOnly == null ? Input.empty() : this.validateOnly;
    }

    public DashboardArgs(
        @Nullable Input<ColumnLayoutArgs> columnLayout,
        Input<String> displayName,
        @Nullable Input<String> etag,
        @Nullable Input<GridLayoutArgs> gridLayout,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<MosaicLayoutArgs> mosaicLayout,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<RowLayoutArgs> rowLayout,
        @Nullable Input<String> validateOnly) {
        this.columnLayout = columnLayout;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.etag = etag;
        this.gridLayout = gridLayout;
        this.labels = labels;
        this.mosaicLayout = mosaicLayout;
        this.name = name;
        this.project = project;
        this.rowLayout = rowLayout;
        this.validateOnly = validateOnly;
    }

    private DashboardArgs() {
        this.columnLayout = Input.empty();
        this.displayName = Input.empty();
        this.etag = Input.empty();
        this.gridLayout = Input.empty();
        this.labels = Input.empty();
        this.mosaicLayout = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.rowLayout = Input.empty();
        this.validateOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ColumnLayoutArgs> columnLayout;
        private Input<String> displayName;
        private @Nullable Input<String> etag;
        private @Nullable Input<GridLayoutArgs> gridLayout;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<MosaicLayoutArgs> mosaicLayout;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<RowLayoutArgs> rowLayout;
        private @Nullable Input<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnLayout = defaults.columnLayout;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.gridLayout = defaults.gridLayout;
    	      this.labels = defaults.labels;
    	      this.mosaicLayout = defaults.mosaicLayout;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rowLayout = defaults.rowLayout;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder setColumnLayout(@Nullable Input<ColumnLayoutArgs> columnLayout) {
            this.columnLayout = columnLayout;
            return this;
        }

        public Builder setColumnLayout(@Nullable ColumnLayoutArgs columnLayout) {
            this.columnLayout = Input.ofNullable(columnLayout);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setGridLayout(@Nullable Input<GridLayoutArgs> gridLayout) {
            this.gridLayout = gridLayout;
            return this;
        }

        public Builder setGridLayout(@Nullable GridLayoutArgs gridLayout) {
            this.gridLayout = Input.ofNullable(gridLayout);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMosaicLayout(@Nullable Input<MosaicLayoutArgs> mosaicLayout) {
            this.mosaicLayout = mosaicLayout;
            return this;
        }

        public Builder setMosaicLayout(@Nullable MosaicLayoutArgs mosaicLayout) {
            this.mosaicLayout = Input.ofNullable(mosaicLayout);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRowLayout(@Nullable Input<RowLayoutArgs> rowLayout) {
            this.rowLayout = rowLayout;
            return this;
        }

        public Builder setRowLayout(@Nullable RowLayoutArgs rowLayout) {
            this.rowLayout = Input.ofNullable(rowLayout);
            return this;
        }

        public Builder setValidateOnly(@Nullable Input<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder setValidateOnly(@Nullable String validateOnly) {
            this.validateOnly = Input.ofNullable(validateOnly);
            return this;
        }
        public DashboardArgs build() {
            return new DashboardArgs(columnLayout, displayName, etag, gridLayout, labels, mosaicLayout, name, project, rowLayout, validateOnly);
        }
    }
}
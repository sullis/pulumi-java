// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a documentation page. A page can contain subpages to represent nested documentation set structure.
 * 
 */
public final class PageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PageArgs Empty = new PageArgs();

    /**
     * The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Subpages of this page. The order of subpages specified here will be honored in the generated docset.
     * 
     */
    @InputImport(name="subpages")
      private final @Nullable Input<List<PageArgs>> subpages;

    public Input<List<PageArgs>> getSubpages() {
        return this.subpages == null ? Input.empty() : this.subpages;
    }

    public PageArgs(
        @Nullable Input<String> content,
        @Nullable Input<String> name,
        @Nullable Input<List<PageArgs>> subpages) {
        this.content = content;
        this.name = name;
        this.subpages = subpages;
    }

    private PageArgs() {
        this.content = Input.empty();
        this.name = Input.empty();
        this.subpages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<String> name;
        private @Nullable Input<List<PageArgs>> subpages;

        public Builder() {
    	      // Empty
        }

        public Builder(PageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.name = defaults.name;
    	      this.subpages = defaults.subpages;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
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

        public Builder setSubpages(@Nullable Input<List<PageArgs>> subpages) {
            this.subpages = subpages;
            return this;
        }

        public Builder setSubpages(@Nullable List<PageArgs> subpages) {
            this.subpages = Input.ofNullable(subpages);
            return this;
        }
        public PageArgs build() {
            return new PageArgs(content, name, subpages);
        }
    }
}
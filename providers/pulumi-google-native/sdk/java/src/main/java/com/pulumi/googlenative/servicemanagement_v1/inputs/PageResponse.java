// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a documentation page. A page can contain subpages to represent nested documentation set structure.
 * 
 */
public final class PageResponse extends com.pulumi.resources.InvokeArgs {

    public static final PageResponse Empty = new PageResponse();

    /**
     * The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
     * 
     */
    @Import(name="content", required=true)
    private String content;

    /**
     * @return The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
     * 
     */
    public String content() {
        return this.content;
    }

    /**
     * The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Subpages of this page. The order of subpages specified here will be honored in the generated docset.
     * 
     */
    @Import(name="subpages", required=true)
    private List<PageResponse> subpages;

    /**
     * @return Subpages of this page. The order of subpages specified here will be honored in the generated docset.
     * 
     */
    public List<PageResponse> subpages() {
        return this.subpages;
    }

    private PageResponse() {}

    private PageResponse(PageResponse $) {
        this.content = $.content;
        this.name = $.name;
        this.subpages = $.subpages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PageResponse $;

        public Builder() {
            $ = new PageResponse();
        }

        public Builder(PageResponse defaults) {
            $ = new PageResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            $.content = content;
            return this;
        }

        /**
         * @param name The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param subpages Subpages of this page. The order of subpages specified here will be honored in the generated docset.
         * 
         * @return builder
         * 
         */
        public Builder subpages(List<PageResponse> subpages) {
            $.subpages = subpages;
            return this;
        }

        /**
         * @param subpages Subpages of this page. The order of subpages specified here will be honored in the generated docset.
         * 
         * @return builder
         * 
         */
        public Builder subpages(PageResponse... subpages) {
            return subpages(List.of(subpages));
        }

        public PageResponse build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.subpages = Objects.requireNonNull($.subpages, "expected parameter 'subpages' to be non-null");
            return $;
        }
    }

}

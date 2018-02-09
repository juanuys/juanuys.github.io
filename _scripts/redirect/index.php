<?
//header('content-type: text/plain; charset=utf-8');
$reqpath = ltrim(preg_replace('/\?.+$/', '', $_SERVER['REQUEST_URI']), '/');
$dstpath = $reqpath;
if (isset($gitblog_urls[$reqpath])) {
  $dstpath = $gitblog_urls[$reqpath];
} else if (preg_match('@^post/([0-9]+)/@', $reqpath, $m) && $tumblr_urls[$m[1]]) {
  $dstpath = $tumblr_urls[$m[1]];
} else if (preg_match('@^archive/(.+)$@', $reqpath, $m)) {
  $dstpath = $m[1];
}

header('HTTP/1.1 301 Moved Permanently');
header('Location: http://opyate.com/'.$dstpath);
?>
